package steps;

import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import models.*;

import static io.restassured.RestAssured.given;

public class TestSteps {

    @Step("Создаем запись с title {1} и text {0}")
    public static CreateNoteResponseModel createNote(String text, String title) {
        CreateNoteRequest createNoteRequest = new CreateNoteRequest();
        createNoteRequest.setText(text);
        createNoteRequest.setTitle(title);

        ValidatableResponse response = given().contentType(ContentType.JSON)
                .header("authorization", "Bearer ODM4YzhjNzktZjA1Ni00YjljLWJlODYtNjY5YmZjNTVhNWU4")
                .body(createNoteRequest)
                .log().all()
                .when()
                .post("https://api.m3o.com/v1/notes/Create")
                .then()
                .log().all();


        CreateNoteWrapperModel createNoteWrapperModel = response.extract().as(CreateNoteWrapperModel.class);
        return createNoteWrapperModel.getNote();
    }
@Step("Удаляем имеющиеся записи испозьзуя id {0} ")
    public static DeleteNoteModel deleteNote(String id) {
        DeleteNoteIdModel deleteNoteIdModel = new DeleteNoteIdModel();
        deleteNoteIdModel.setId(id);

        ValidatableResponse response = given().contentType(ContentType.JSON)
                .header("authorization", "Bearer ODM4YzhjNzktZjA1Ni00YjljLWJlODYtNjY5YmZjNTVhNWU4")
                .body(deleteNoteIdModel)
                .log().all()
                .when()
                .post("https://api.m3o.com/v1/notes/Delete")
                .then()
                .log().all();
        DeleteNoteWrapperModel deleteNoteWrapperModel = response.extract().as(DeleteNoteWrapperModel.class);
        return deleteNoteWrapperModel.getNote();

    }
@Step("Чтение записи по id {0}")
    public static NoteModel readNote(String id) {
        NoteIdModel noteIdModel = new NoteIdModel();
        noteIdModel.setId(id);


        ValidatableResponse response = given().contentType(ContentType.JSON)
                .header("authorization", "Bearer ODM4YzhjNzktZjA1Ni00YjljLWJlODYtNjY5YmZjNTVhNWU4")
                .body(noteIdModel)
                .log().all()
                .when()
                .post("https://api.m3o.com/v1/notes/Read")
                .then()
                .log().all();
        NoteWrapperModel noteWrapperModel = response.extract().as(NoteWrapperModel.class);
        return noteWrapperModel.getNote();

    }
@Step("Обновляем запись с title {2}, text {1} и id {0} ")
    public static UpdateNoteModelResponse updateNote(String id, String text, String title) {
        UpdateNoteModel updateNoteModel = new UpdateNoteModel();
        updateNoteModel.setId(id);
        updateNoteModel.setText(text);
        updateNoteModel.setTitle(title);

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
        UpdateNoteWrapperModelResponse updateNoteWrapperModelResponse = response.extract().as(UpdateNoteWrapperModelResponse.class);
        return updateNoteWrapperModelResponse.getNote();

    }



}
