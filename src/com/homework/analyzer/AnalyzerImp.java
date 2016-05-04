package com.homework.analyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.homework.parts.*;
import com.homework.parts.Number;

public class AnalyzerImp implements Analyzer {
    private Pattern paragrapPattern;
    private Pattern sentencePattern;
    private Pattern wordPattern;
    private Pattern signPattern;
    private Pattern numberPattern;
    
    public AnalyzerImp() {
	paragrapPattern = Pattern.compile(PARAGRAPH);
	sentencePattern = Pattern.compile(SENTENCE);
	wordPattern = Pattern.compile(WORD);
	signPattern = Pattern.compile(SIGN);
	numberPattern = Pattern.compile(NUMBER);
    }
    
    @Override
    public String filterText(String text) {
	return text.replaceAll(Analyzer.REAPLECE_SYMBOLS, Analyzer.CHANGE_TO_CHARACTER);
    }

    @Override
    public List<Paragraph> getParagraphs(String text) {
	Matcher matcher = paragrapPattern.matcher(text);
	List<Paragraph> paragraphs = new ArrayList<>();
	String paragraphString;
	while (matcher.find()) {
	    paragraphString = matcher.group();
	    if (!paragraphString.isEmpty()) {
		paragraphs.add(new Paragraph(getSentences(paragraphString)));
	    }
	}
	return paragraphs;
    }

    @Override
    public List<Sentence> getSentences(String text) {
	Matcher matcher = sentencePattern.matcher(text);
	List<Sentence> sentences = new ArrayList<>();
	String sentencesString;
	while (matcher.find()) {
	    sentencesString = matcher.group();
	    if (!sentencesString.isEmpty()) {
		sentences.add(new Sentence(getTextWords(sentencesString), 
		    getTextNumbers(sentencesString), getTextSigns(sentencesString)));
	    }
	}
	return sentences;
    }

    @Override
    public List<Word> getTextWords(String text) {
	List<Word> words = new ArrayList<>();
	Matcher matcher = wordPattern.matcher(text);
	String word;
	while (matcher.find()) {
	    word = matcher.group();
	    if (word.isEmpty()) {
		words.add(new Word(word, matcher.start()));
	    }
	}
	return words;
    }

    @Override
    public List<Number> getTextNumbers(String text) {
	List<Number> numbers = new ArrayList<>();
	Matcher matcher = numberPattern.matcher(text);
	String number;
	while (matcher.find()) {
	    number = matcher.group();
	    if (!number.isEmpty()) {
		numbers.add(new Number(Integer.valueOf(number), matcher.start()));
	    }
	}
	return numbers;
    }

    @Override
    public List<Sign> getTextSigns(String text) {
	List<Sign> signs = new ArrayList<>();
	Matcher matcher = signPattern.matcher(text);
	String sign;
	while (matcher.find()) {
	    sign = matcher.group();
	    if (!sign.isEmpty()) {
		signs.add(new Sign(sign.charAt(0), matcher.start()));
	    }
	}
	return signs;
    }

    /* (non-Javadoc)
     * @see com.homework.analyzer.Analyzer#sortSentencesByWordsCount(com.homework.parts.Text)
     */
    @Override
    public List<Sentence> sortSentencesByWordsCount(Text text) {
	List<Sentence> sentences = new ArrayList<>();
	text.getParagraphs().stream().forEach((p) -> sentences.addAll(p.getSentences()));
	sentences.stream().sorted((sentenc1, sentence2) -> 
			Integer.compare(sentenc1.getWords().size(), 
				sentence2.getWords().size()));
	return sentences;
    }

}
