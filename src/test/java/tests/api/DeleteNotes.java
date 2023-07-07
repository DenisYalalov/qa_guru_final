package tests.api;

import io.qameta.allure.Story;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import models.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.*;
import static steps.TestSteps.createNote;
import static steps.TestSteps.deleteNote;

public class DeleteNotes {
    @Story("Удалить запись")
    @Test
    @Tag("Api")
    @DisplayName("Удаление запись")
    void deleteNoteTest() {

        String testNoteText = "This is my note 34";
        String testNoteTitle = "New Note";

        CreateNoteResponseModel createNoteResponseModel = createNote(testNoteText, testNoteTitle);
        String id = createNoteResponseModel.getId();
        DeleteNoteModel deleteNoteModel = deleteNote(createNoteResponseModel.getId());
        assertThat(deleteNoteModel.getId()).isEqualTo(id);
        assertThat(deleteNoteModel.getTitle()).isEqualTo(testNoteTitle);
        assertThat(deleteNoteModel.getText()).isEqualTo(testNoteText);


        NoteIdModel noteIdModel = new NoteIdModel();
        noteIdModel.setId(createNoteResponseModel.getId());


        ValidatableResponse response = given().contentType(ContentType.JSON)
                .header("authorization", "Bearer ODM4YzhjNzktZjA1Ni00YjljLWJlODYtNjY5YmZjNTVhNWU4")
                .body(noteIdModel)
                .log().all()
                .when()
                .post("https://api.m3o.com/v1/notes/Read")
                .then()
                .log().all();
        ErrorModel errorModel = response.extract().as(ErrorModel.class);
        assertThat(errorModel.getId()).isEqualTo("notes.read");
        assertThat(errorModel.getDetail()).isEqualTo("Note not found");


    }

}
