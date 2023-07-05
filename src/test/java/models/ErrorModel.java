package models;

import lombok.Data;

@Data
public class ErrorModel {
    public String id;
    public int code;
    public String detail;
    public String status;
}

