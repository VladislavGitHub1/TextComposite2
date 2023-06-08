package com.chernenkov.task;

import com.chernenkov.task.chainofresponsibility.TextParser;
import com.chernenkov.task.composite.TextComposite;
import com.chernenkov.task.exception.CustomException;
import com.chernenkov.task.reader.impl.TextReaderImpl;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws CustomException {
        TextReaderImpl textReader = new TextReaderImpl();
        String readed = textReader.readText("text.txt");
        TextParser parser = new TextParser();
        TextComposite composite = new TextComposite();
        parser.parse(readed, composite);
        composite.action();
    }
}
