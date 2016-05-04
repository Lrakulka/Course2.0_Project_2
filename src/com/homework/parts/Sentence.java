package com.homework.parts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
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
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @SuppressWarnings("unchecked")
    @Override
    public String toString() {
        StringBuilder sentence = new StringBuilder();
        ArrayList<SentencePart<Object>> parts = new ArrayList<>();
        parts.addAll((Collection<? extends SentencePart<Object>>) words);
        parts.addAll((Collection<? extends SentencePart<Object>>) numbers);
        parts.addAll((Collection<? extends SentencePart<Object>>) signs);
        parts.sort(new Comparator<SentencePart<Object>>() {

	    @Override
	    public int compare(SentencePart<Object> o1, SentencePart<Object> o2) {
		return Integer.compare(o1.getPartPosition(), o2.getPartPosition());
	    }
	});
        parts.stream().forEach((part) -> sentence.append(part.toString()));
        return sentence.toString();
    }
}
