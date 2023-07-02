package tests.api;

import models.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static steps.TestSteps.updateNote;


public class UpdateNotes {
    @Test
    void updateNoteApi() {
        UpdateNoteModelResponse updateNoteModelResponse = updateNote("c279e3e5-15b7-11ee-a6c7-7eeb313f761a",
                "TestUpdateApi", "Update NoteЕtest");

        assertThat(updateNoteModelResponse.getId()).isEqualTo("c279e3e5-15b7-11ee-a6c7-7eeb313f761a");
        assertThat(updateNoteModelResponse.getTitle()).isEqualTo("Update NoteЕtest");
        assertThat(updateNoteModelResponse.getText()).isEqualTo("TestUpdateApi");
    }
}
