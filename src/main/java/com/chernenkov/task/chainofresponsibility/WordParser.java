package com.chernenkov.task.chainofresponsibility;

import com.chernenkov.task.composite.Symbol;
import com.chernenkov.task.composite.TextComposite;

public class WordParser extends AbstractParser{
    @Override
    public void parse(String word, TextComposite wordComponent) {
        char[] symbols = word.toCharArray();
        for (char symbol : symbols){
            Symbol letter = new Symbol(symbol);
            wordComponent.add(letter);
        }
    }
}
