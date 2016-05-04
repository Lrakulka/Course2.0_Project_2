package com.homework.parts;

public interface SentencePart {
    /**
     * Return part of text.
     * @return part of text
     */
    String getPart();
    
    /**
     * Set part of text.
     * @param part
     */
    void setPart(String part);
    
    /**
     * return type of sentence part.
     * @return type
     */
    int typeOfPart();
}
