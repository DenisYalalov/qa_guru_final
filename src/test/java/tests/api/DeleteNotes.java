package tests.api;

import configs.ApiConfig;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import models.*;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.*;
import static steps.NoteApi.createNote;
import static steps.NoteApi.deleteNote;
import static steps.SpecsM3O.baseRequestSpec;
import static steps.SpecsM3O.okResponseSpec;

@Owner("Yalalov D")
public class DeleteNotes extends TestBaseApi {
    static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
    static String token = apiConfig.getApiToken();

    @Story("Удалить запись")
    @Test
    @Tag("Api")
    @DisplayName("Удаление записи")
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

        ValidatableResponse response = given(baseRequestSpec)
                .body(noteIdModel)
                .when()
                .post("/v1/notes/Read")
                .then()
                .spec(okResponseSpec);
        ErrorModel errorModel = response.extract().as(ErrorModel.class);
        assertThat(errorModel.getId()).isEqualTo("notes.read");
        assertThat(errorModel.getDetail()).isEqualTo("Note not found");

    }

}
