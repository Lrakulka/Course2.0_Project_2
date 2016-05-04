package com.homework.parts;

public interface SentencePart<T> {
    /**
     * Return part of text.
     * @return part of text
     */
    T getPart();
    
    /**
     * Return position of element in text
     * @return position
     */
    int getPartPosition();
    
    String toString();
}
