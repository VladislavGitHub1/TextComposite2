package com.chernenkov.task.chainofresponsibility;

import com.chernenkov.task.composite.TextComposite;
import com.chernenkov.task.composite.TextType;

import java.util.ArrayList;
import java.util.List;

public class SentenceParser extends AbstractParser{
    public SentenceParser() {
        this.successor = new WordParser();
    }

    @Override
    public void parse(String sentence, TextComposite composite) {
        List<String> words = new ArrayList<>();
        words = List.of(sentence.split("\n"));
        for (String word : words){
            TextComposite wordComponent = new TextComposite();
            wordComponent.setType(TextType.WORD);
            composite.add(wordComponent);
            successor.parse(word, composite);
        }
    }
}
