package tests.api;

import models.CreateNoteResponseModel;
import models.DeleteNoteModel;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static steps.TestSteps.createNote;
import static steps.TestSteps.deleteNote;

public class CreateNotesRequest {
    @Test
    void createNotesTest() {
        CreateNoteResponseModel createNoteResponseModel = createNote("This is my note 34", "New Note");

        assertThat(createNoteResponseModel.getTitle()).isEqualTo("New Note");
        assertThat(createNoteResponseModel.getText()).isEqualTo("This is my note 34");

    }
}
