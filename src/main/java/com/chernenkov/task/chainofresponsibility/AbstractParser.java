package com.chernenkov.task.chainofresponsibility;

import com.chernenkov.task.composite.TextComposite;

public abstract class AbstractParser {
    protected AbstractParser successor;
    public abstract void parse(String text, TextComposite composite);

}
