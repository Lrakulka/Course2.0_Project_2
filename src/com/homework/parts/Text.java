package com.homework.parts;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Paragraph> paragraphs;

    public List<Paragraph> getParagraphs() {
        return new ArrayList<>(paragraphs);
    }

    public Text(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }
    
}
