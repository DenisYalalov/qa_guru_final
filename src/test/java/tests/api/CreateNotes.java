package tests.api;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import models.CreateNote;
import models.CreateNoteModel;
import models.CreateNoteWrapperModel;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.*;

public class CreateNotes {
    @Test
    void createNotesTest() {
        CreateNote createNote = new CreateNote();
        createNote.setText("This is my note 34");
        createNote.setTitle("New Note");

        ValidatableResponse response = given().contentType(ContentType.JSON)
                .header("authorization", "Bearer ODM4YzhjNzktZjA1Ni00YjljLWJlODYtNjY5YmZjNTVhNWU4")
                .body(createNote)
                .log().all()
                .when()
                .post("https://api.m3o.com/v1/notes/Create")
                .then()
                .log().all();

        CreateNoteWrapperModel createNoteWrapperModel = response.extract().as(CreateNoteWrapperModel.class);
        CreateNoteModel createNoteModel = createNoteWrapperModel.getNote();

        assertThat(createNoteModel.getId()).isEqualTo("00bacfd8d-169e-11ee-a6c7-7eeb313f761a");
        assertThat(createNoteModel.getTitle()).isEqualTo("New Note");
        assertThat(createNoteModel.getText()).isEqualTo("This is my note 34");

    }
}
