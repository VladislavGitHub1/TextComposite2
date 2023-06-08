package com.chernenkov.task.composite;

public class Letter implements TextComponent{
    private char letter;
    private TextType type = TextType.LETTER;

    public Letter(char letter) {
        this.letter = letter;
    }

    @Override
    public void action() {
        System.out.print(letter);
    }
}
