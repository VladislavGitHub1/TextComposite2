package com.chernenkov.task.chainofresponsibility;

import com.chernenkov.task.composite.Letter;
import com.chernenkov.task.composite.TextComposite;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.List;

public class WordParser extends AbstractParser{
    @Override
    public void parse(String word, TextComposite wordComponent) {
        char[] symbols = word.toCharArray();
        for (char symbol : symbols){
            Letter letter = new Letter(symbol);
            wordComponent.add(letter);
        }
    }
}
