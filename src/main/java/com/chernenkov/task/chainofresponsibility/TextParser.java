package com.chernenkov.task.chainofresponsibility;

import com.chernenkov.task.composite.TextComposite;
import com.chernenkov.task.composite.TextType;

import java.util.ArrayList;
import java.util.List;

public class TextParser extends AbstractParser {
    public TextParser() {
        this.successor = new ParagraphParser();
    }


    @Override
    public void parse(String text, TextComposite composite) {
        TextComposite textComponent = new TextComposite();
        textComponent.setType(TextType.TEXT);
        composite.add(textComponent);
        List<String> paragraphs = new ArrayList<>();
        paragraphs = List.of(text.split("(\\t|\\s{4})"));
        for (String paragraph : paragraphs){
            TextComposite paragraphComponent = new TextComposite();
            paragraphComponent.setType(TextType.PARAGRAPH);
            composite.add(paragraphComponent);
            successor.parse(paragraph, composite);
        }
    }
}
