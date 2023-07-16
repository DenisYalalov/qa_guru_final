package steps;

import configs.ApiConfig;
import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;
import models.*;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;
import static steps.SpecsM3O.baseRequestSpec;
import static steps.SpecsM3O.okResponseSpec;

public class NoteApi {
    static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
    static String token = apiConfig.getApiToken();

    @Step("Создаем запись с title {1} и text {0}")
    public static CreateNoteResponseModel createNote(String text, String title) {
        CreateNoteRequest createNoteRequest = new CreateNoteRequest();
        createNoteRequest.setText(text);
        createNoteRequest.setTitle(title);

        ValidatableResponse response = given(baseRequestSpec)
                .body(createNoteRequest)
                .when()
                .post("/v1/notes/Create")
                .then()
                .spec(okResponseSpec);

        CreateNoteWrapperModel createNoteWrapperModel = response.extract().as(CreateNoteWrapperModel.class);
        return createNoteWrapperModel.getNote();
    }

    @Step("Удаляем имеющиеся записи испозьзуя id {0} ")
    public static DeleteNoteModel deleteNote(String id) {
        DeleteNoteIdModel deleteNoteIdModel = new DeleteNoteIdModel();
        deleteNoteIdModel.setId(id);

        ValidatableResponse response = given(baseRequestSpec)
                .body(deleteNoteIdModel)
                .when()
                .post("/v1/notes/Delete")
                .then()
                .spec(okResponseSpec);
        DeleteNoteWrapperModel deleteNoteWrapperModel = response.extract().as(DeleteNoteWrapperModel.class);
        return deleteNoteWrapperModel.getNote();

    }

    @Step("Чтение записи по id {0}")
    public static NoteModel readNote(String id) {
        NoteIdModel noteIdModel = new NoteIdModel();
        noteIdModel.setId(id);


        ValidatableResponse response = given(baseRequestSpec)
                .body(noteIdModel)
                .when()
                .post("/v1/notes/Read")
                .then()
                .spec(okResponseSpec);
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

        ValidatableResponse response = given(baseRequestSpec)
                .body(updateNoteWrapperModel)
                .when()
                .post("/v1/notes/Update")
                .then()
                .spec(okResponseSpec);
        UpdateNoteWrapperModelResponse updateNoteWrapperModelResponse = response.extract().as(UpdateNoteWrapperModelResponse.class);
        return updateNoteWrapperModelResponse.getNote();

    }


}
