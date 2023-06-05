package com.chernenkov.task;

import com.chernenkov.task.exception.CustomException;
import com.chernenkov.task.reader.impl.TextReaderImpl;

public class main {
    public static void main(String[] args) throws CustomException {
        TextReaderImpl textReader = new TextReaderImpl();
        System.out.println(textReader.readText("text.data"));

    }
}
