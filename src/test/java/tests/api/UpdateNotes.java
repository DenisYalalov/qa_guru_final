package tests.api;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import models.*;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


public class UpdateNotes {
    @Test
    void NotesApi() {
        UpdateModelRequest updateModelRequest = new UpdateModelRequest();
        updateModelRequest.setId("c279e3e5-15b7-11ee-a6c7-7eeb313f761a");
        updateModelRequest.setText("TestUpdateApi");
        updateModelRequest.setTitle("Update NoteЕtest");

        ValidatableResponse response = given().contentType(ContentType.JSON)
                .header("authorization", "Bearer ODM4YzhjNzktZjA1Ni00YjljLWJlODYtNjY5YmZjNTVhNWU4")
                .body(updateModelRequest)
                .log().all()
                .when()
                .post("https://api.m3o.com/v1/notes/Update")
                .then()
                .log().all();
        UpdateWrapperModel updateWrapperModel = response.extract().as(UpdateWrapperModel.class);
        UpdateNoteResponse updateNoteResponse = updateWrapperModel.getNote();
        assertThat(updateNoteResponse.getId()).isEqualTo("c279e3e5-15b7-11ee-a6c7-7eeb313f761a");
        assertThat(updateNoteResponse.getTitle()).isEqualTo("Update NoteЕtest");
        assertThat(updateNoteResponse.getText()).isEqualTo("TestUpdateApi");
    }
}
