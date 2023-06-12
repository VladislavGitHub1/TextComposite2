package com.chernenkov.task.composite;

public class Symbol implements TextComponent{
    private char letter;
    private TextType type;

    public Symbol(char letter) {
        this.letter = letter;
        if (Character.isPunctuation(letter)){
            type = TextType.PUNCTUATION;
        }
        else {
            type = TextType.LETTER;
        }
    }

    @Override
    public String action() {
        return String.valueOf(letter);
    }
}
