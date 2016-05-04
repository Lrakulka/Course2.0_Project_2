package com.homework.parts;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private String unknownElements;
    private List<SentencePart> parts;
    private String endSymbol;
    
    /**
     * Constructor of Sentence.
     * @param unknownElements
     * @param parts
     * @param endSymbol
     */
    public Sentence(String unknownElements, List<SentencePart> parts, 
	    String endSymbol) {
	this.endSymbol = endSymbol;
	this.unknownElements = unknownElements;
	this.parts = new ArrayList<>(parts);
    }
    
    public String getUnknownElements() {
        return unknownElements;
    }
    
    public List<SentencePart> getParts() {
        return parts;
    }
    
    public String getEndSymbol() {
	return endSymbol;
    }
    
}
