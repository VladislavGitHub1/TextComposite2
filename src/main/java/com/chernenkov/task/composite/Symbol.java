package com.chernenkov.task.composite;

public class Symbol implements TextComponent{
    private char letter;
    private TextType type;
    char[] punctuationMarks = {'.', ',', ';', ':', '!', '?', '-', '(', ')', '[', ']', '{', '}'};
    public Symbol(char letter) {
        this.letter = letter;
        boolean isPunctuation = false;
        for (char mark : punctuationMarks) {
            if (letter == mark) {
                isPunctuation = true;
                break;
            }
        }

        if (isPunctuation){
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
