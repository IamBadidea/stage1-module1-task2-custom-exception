package com.epam.mjc;

public class NotFoundStudentException extends IllegalArgumentException{
    NotFoundStudentException(String message) {
        super(message);
    }
}
