package tests.api;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import models.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static steps.TestSteps.*;
@Owner("Yalalov D")
public class ReadNotes {
    @Story("Чтение записи")
    @Test
    @Tag("Api")
    @DisplayName("Проверяем, что созданная запись читается")
    void getTables() {
        String TestReadTitle = "Update NoteЕtest";
        String TestReadText = "TestUpdateApi";

        CreateNoteResponseModel createNoteResponseModel = createNote(TestReadText, TestReadTitle);
        String id = createNoteResponseModel.getId();
        NoteModel noteModel = readNote(createNoteResponseModel.getId());

        assertThat(noteModel.getId()).isEqualTo(id);
        assertThat(noteModel.getTitle()).isEqualTo(TestReadTitle);
        assertThat(noteModel.getText()).isEqualTo(TestReadText);


    }
}
