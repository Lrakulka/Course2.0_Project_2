package com.homework.parts;

import java.util.ArrayList;
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
    
    public final List<Word> getWords() {
	return new ArrayList<>(words);
    }
    
    public List<Sign> getSigns() {
	return new ArrayList<>(signs);
    }
    
    public List<Number> getNumbers() {
	return new ArrayList<>(numbers);
    }
}
