package tests.api;

import models.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static steps.TestSteps.*;

public class ReadNotes {
    @Test
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
