package com.homework.parts;

import java.util.ArrayList;
import java.util.List;

import com.homework.analyzer.Analyzer;
import com.homework.analyzer.AnalyzerImp;

public class Text {
    private List<Paragraph> paragraphs;
    private String text;
    private String filtrText;
    
    public Text(String text) {
	this.text = text;
    }
    
    public String getText() {
	return text;
    }
    
    public String getFiltrText() {
	return filtrText;
    }
    
    public List<Paragraph> getParagraphs() {
        return new ArrayList<>(paragraphs);
    }

    public void getTextClassTree() {
	Analyzer analyzer = new AnalyzerImp();
	filtrText = analyzer.filterText(text);
	paragraphs = analyzer.getParagraphs(this);
    }
    
}
