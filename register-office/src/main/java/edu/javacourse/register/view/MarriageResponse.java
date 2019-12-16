package edu.javacourse.register.view;

import java.io.Serializable;

public class MarriageResponse implements Serializable {

    private static final String EXISTS = "IS EXISTS";
    private static final String NOT_EXISTS = "IS NOT EXISTS";
    private static final String NOT_ACTIVE = "IS EXISTS, BUT NOT ACTIVE";

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static String getExists() {
        return EXISTS;
    }

    public static String getNotExists() {
        return NOT_EXISTS;
    }

    public static String getNotActive() {
        return NOT_ACTIVE;
    }
}
