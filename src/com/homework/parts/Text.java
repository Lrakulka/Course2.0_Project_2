package com.homework.parts;

import java.util.List;

public class Text {
    private List<Paragraph> paragraphs;

    public List<Paragraph> getText() {
        return paragraphs;
    }

    public Text(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }
    
}
