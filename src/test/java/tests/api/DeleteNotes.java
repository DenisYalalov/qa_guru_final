package tests.api;

import models.CreateNoteResponseModel;
import models.DeleteNoteModel;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static steps.TestSteps.createNote;
import static steps.TestSteps.deleteNote;

public class DeleteNotes {
    @Test
    void deleteNoteTest() {
        String testNoteText = "This is my note 34";
        String testNoteTitle = "New Note";

        CreateNoteResponseModel createNoteResponseModel = createNote(testNoteText, testNoteTitle);
        String id = createNoteResponseModel.getId();
        DeleteNoteModel deleteNoteModel = deleteNote(createNoteResponseModel.getId());
        assertThat(deleteNoteModel.getId()).isEqualTo(id);
        assertThat(deleteNoteModel.getTitle()).isEqualTo(testNoteTitle);
        assertThat(deleteNoteModel.getText()).isEqualTo(testNoteText);


    }
}
