package tests.api;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import models.*;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.*;


public class UpdateNotes {
    @Test
    void updateNoteApi() {
        UpdateNoteModel updateNoteModel = new UpdateNoteModel();
        updateNoteModel.setId("c279e3e5-15b7-11ee-a6c7-7eeb313f761a");
        updateNoteModel.setText("TestUpdateApi");
        updateNoteModel.setTitle("Update NoteЕtest");

        UpdateNoteWrapperModel updateNoteWrapperModel = new UpdateNoteWrapperModel();
        updateNoteWrapperModel.setNote(updateNoteModel);

        ValidatableResponse response = given().contentType(ContentType.JSON)
                .header("authorization", "Bearer ODM4YzhjNzktZjA1Ni00YjljLWJlODYtNjY5YmZjNTVhNWU4")
                .body(updateNoteWrapperModel)
                .log().all()
                .when()
                .post("https://api.m3o.com/v1/notes/Update")
                .then()
                .log().all();
        NoteWrapperModel noteWrapperModel = response.extract().as(NoteWrapperModel.class);
        NoteModel updateNoteResponse = noteWrapperModel.getNote();
        assertThat(updateNoteResponse.getId()).isEqualTo("c279e3e5-15b7-11ee-a6c7-7eeb313f761a");
        assertThat(updateNoteResponse.getTitle()).isEqualTo("Update NoteЕtest");
        assertThat(updateNoteResponse.getText()).isEqualTo("TestUpdateApi");
    }
}
