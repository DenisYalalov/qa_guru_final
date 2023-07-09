package tests.api;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import models.CreateNoteResponseModel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static steps.TestSteps.createNote;


@Owner("Yalalov D")
public class CreateNotesRequest {
    @Story("Создание новой записи")
    @Test
    @Tag("Api")
    @DisplayName("Проверяем создание новой записи")
    void createNotesTest() {
        CreateNoteResponseModel createNoteResponseModel = createNote("This is my note 34", "New Note");

        assertThat(createNoteResponseModel.getTitle()).isEqualTo("New Note");
        assertThat(createNoteResponseModel.getText()).isEqualTo("This is my note 34");

    }
}
