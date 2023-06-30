package tests.api;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import models.DeleteNoteIdModel;
import models.DeleteNoteModel;
import models.DeleteNoteWrapperModel;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.*;

public class DeleteNotes {
    @Test
    void deleteNoteTest() {
        DeleteNoteIdModel deleteNoteIdModel = new DeleteNoteIdModel();
        deleteNoteIdModel.setId("4e1f2580-1432-11ee-a6c7-7eeb313f761a");

        ValidatableResponse response = given().contentType(ContentType.JSON)
                .header("authorization", "Bearer ODM4YzhjNzktZjA1Ni00YjljLWJlODYtNjY5YmZjNTVhNWU4")
                .body(deleteNoteIdModel)
                .log().all()
                .when()
                .post("https://api.m3o.com/v1/notes/Delete")
                .then()
                .log().all();
        DeleteNoteWrapperModel deleteNoteWrapperModel = response.extract().as(DeleteNoteWrapperModel.class);
        DeleteNoteModel deleteNoteModel = deleteNoteWrapperModel.getNote();
        assertThat(deleteNoteModel.getId()).isEqualTo("4e1f2580-1432-11ee-a6c7-7eeb313f761a");
        assertThat(deleteNoteModel.getTitle()).isEqualTo("Update Note");
        assertThat(deleteNoteModel.getText()).isEqualTo("This is my note 34");


    }
}
