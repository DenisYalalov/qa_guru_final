package models;

import lombok.Data;

@Data
public class CreateNoteRequest {
    public String text;
    public String title;
}

