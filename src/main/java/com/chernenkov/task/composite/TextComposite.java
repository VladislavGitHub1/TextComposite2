package com.chernenkov.task.composite;

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
        return null;
    }
}
