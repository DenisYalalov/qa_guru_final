package tests.api;

import io.qameta.allure.Story;
import models.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static steps.TestSteps.updateNote;


public class UpdateNotes {
    @Story("Обновление записи")
    @Test
    @Tag("Api")
    @DisplayName("Проверяем обновление записи")
    void updateNoteApi() {
        UpdateNoteModelResponse updateNoteModelResponse = updateNote("c279e3e5-15b7-11ee-a6c7-7eeb313f761a",
                "TestUpdateApi", "Update NoteЕtest");

        assertThat(updateNoteModelResponse.getId()).isEqualTo("c279e3e5-15b7-11ee-a6c7-7eeb313f761a");
        assertThat(updateNoteModelResponse.getTitle()).isEqualTo("Update NoteЕtest");
        assertThat(updateNoteModelResponse.getText()).isEqualTo("TestUpdateApi");
    }
}
