package com.chernenkov.task.chainofresponsibility;

import com.chernenkov.task.composite.TextComposite;
import com.chernenkov.task.composite.TextType;

import java.util.ArrayList;
import java.util.List;

public class ParagraphParser extends AbstractParser{
    public ParagraphParser() {
        this.successor = new SentenceParser();
    }

    @Override
    public void parse(String paragraph, TextComposite paragraphComponent) {
        List<String> sentences = new ArrayList<>();
        sentences = List.of(paragraph.split("/."));
        for (String sentence : sentences){
            TextComposite sentenceComponent = new TextComposite();
            sentenceComponent.setType(TextType.SENTENCE);
            paragraphComponent.add(sentenceComponent);
            successor.parse(sentence, sentenceComponent);
        }
    }
}
