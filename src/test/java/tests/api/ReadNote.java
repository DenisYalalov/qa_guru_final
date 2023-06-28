package tests.api;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import models.NoteIdModel;
import models.NoteModel;
import models.NoteWrapperModel;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.*;

public class ReadNote {
    @Test
    void getTables() {
        NoteIdModel noteIdModel = new NoteIdModel();
        noteIdModel.setId("c279e3e5-15b7-11ee-a6c7-7eeb313f761a");


        ValidatableResponse response = given().contentType(ContentType.JSON)
                .header("authorization", "Bearer ODM4YzhjNzktZjA1Ni00YjljLWJlODYtNjY5YmZjNTVhNWU4")
                .body(noteIdModel)
                .log().all()
                .when()
                .post("https://api.m3o.com/v1/notes/Read")
                .then()
                .log().all();
        NoteWrapperModel noteWrapperModel = response.extract().as(NoteWrapperModel.class);
        NoteModel noteModel = noteWrapperModel.getNote();
        assertThat(noteModel.getId()).isEqualTo("c279e3e5-15b7-11ee-a6c7-7eeb313f761a");
        assertThat(noteModel.getTitle()).isEqualTo("Update NoteЕtest");
        assertThat(noteModel.getText()).isEqualTo("TestUpdateApi");


    }
}
