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
	    paragraphs.add(new Paragraph(getSentences(paragraphString)));
	}
	return paragraphs;
    }

    @Override
    public List<Sentence> getSentences(String text) {
	Matcher matcher = sentencePattern.matcher(text);
	List<Sentence> sentences = new ArrayList<>();
	StringBuilder sentencesString;
	while (matcher.find()) {
	    sentencesString = new StringBuilder(matcher.group());
	    sentences.add(new Sentence(getTextWords(sentencesString), 
		    getTextNumbers(sentencesString), getTextSigns(sentencesString)));
	}
	return sentences;
    }

    @Override
    public List<Word> getTextWords(StringBuilder text) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<Number> getTextNumbers(StringBuilder text) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<Sign> getTextSigns(StringBuilder text) {
	// TODO Auto-generated method stub
	return null;
    }

    /* (non-Javadoc)
     * @see com.homework.analyzer.Analyzer#sortSentencesByWordsCount(com.homework.parts.Text)
     */
    @Override
    public List<Sentence> sortSentencesByWordsCount(Text text) {
	// TODO Auto-generated method stub
	return null;
    }

}
