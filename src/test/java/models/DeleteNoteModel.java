package models;

import lombok.Data;

import java.util.Date;

@Data
public class DeleteNoteModel {
    public String id;
    public Date created;
    public Date updated;
    public String title;
    public String text;
}


