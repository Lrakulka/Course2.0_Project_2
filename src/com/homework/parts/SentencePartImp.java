package com.homework.parts;

public class SentencePartImp implements SentencePart {
    private String part;
    private int type;
    
    @Override
    public String getPart() {
	return part;
    }

    @Override
    public void setPart(String part) {
	this.part = part;	
    }

    @Override
    public int typeOfPart() {
	return type;
    }
   
}
