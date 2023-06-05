package com.chernenkov.task.validator;

public interface TextValidator {
    public static final String WORD = "([A-Za-z]+)";
    boolean TextValidate(String string);
}