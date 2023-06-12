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
    public void parse(String sentence, TextComposite sentenceComponent) {
        List<String> words = new ArrayList<>();
        words = List.of(sentence.split("\\s"));
        for (String word : words){
            TextComposite wordComponent = new TextComposite();
            wordComponent.setType(TextType.WORD);
            sentenceComponent.add(wordComponent);
            word = word.trim();
            successor.parse(word, wordComponent);
        }
    }
}
