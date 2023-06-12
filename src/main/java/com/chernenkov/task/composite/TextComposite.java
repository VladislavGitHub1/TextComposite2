package com.chernenkov.task.composite;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent{
    private List<TextComponent> components = new ArrayList<>();
    private TextType type;

    public TextComposite() {
    }

    public void setType(TextType type) {
        this.type = type;
    }
    public boolean add(TextComponent textComponent){
        return components.add(textComponent);
    }

    @Override
    public String action() {
        StringBuilder sb = new StringBuilder();
        if (this.type == TextType.SENTENCE){
            sb.append(" ");
        } else if (this.type == TextType.WORD) {
            sb.append(" ");
        } else if (this.type == TextType.PARAGRAPH) {
           sb.append("\n");
        }
        for (TextComponent component : components) {
            sb.append(component.action());
        }
        return sb.toString();
    }

}
