package com.homework.parts;

public class SentencePartImp implements SentencePart {
    private String part;
    private byte type;
    
    /**
     * Constructor of Sentence part.
     * @param part - part of text
     * @param type - type of part 
     * 0 - word 1 - number 3 - sign -1 - unknown
     */
    SentencePartImp(String part, byte type) {
	if ((type > 3) && (type < 0)) {
	    this.type = -1;
	}
	this.part = part;
	this.type = type;
    }
    
    @Override
    public String getPart() {
	return part;
    }

    @Override
    public byte typeOfPart() {
	return type;
    }
   
}
