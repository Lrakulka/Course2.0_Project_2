package com.homework.parts;

public interface SentencePart {
    /**
     * Return part of text.
     * @return part of text
     */
    String getPart();
    
    /**
     * return type of sentence part. 
     * 0 - word 1 - number 3 - sign -1 - unknown
     * @return type
     */
    byte typeOfPart();
}
