package com.homework.parts;

import java.util.List;

public class Sentence {
    private List<Word> words;
    private List<Number> numbers;
    private List<Sign> signs;
    /**
     * Constructor of Sentence.
     * @param unknownElements
     * @param parts
     * @param endSymbol
     */
    public Sentence(List<Word> words, List<Number> numbers, List<Sign> signs) {
	this.words = words;
	this.numbers = numbers;
	this.signs = signs;
    }
    
    public List<Word> getWords() {
	return words;
    }
    
    public List<Sign> getSigns() {
	return signs;
    }
    
    public List<Number> getNumbers() {
	return numbers;
    }
}
