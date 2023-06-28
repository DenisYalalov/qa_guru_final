package models;

import lombok.Data;

@Data
public class UpdateModelRequest {
    public String id;
    public String text;
    public String title;
}

