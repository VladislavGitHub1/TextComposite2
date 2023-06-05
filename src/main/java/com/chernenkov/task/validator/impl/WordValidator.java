package com.chernenkov.task.validator.impl;

import com.chernenkov.task.validator.TextValidator;

public class WordValidator implements TextValidator {
    @Override
    public boolean TextValidate(String string) {
        return string.matches(WORD);
    }
}
