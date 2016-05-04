package com.homework.analyzer;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.homework.parts.Paragraph;
import com.homework.parts.Sentence;
import com.homework.parts.SentencePart;
import com.homework.parts.SentencePartImp;
import com.homework.parts.Text;

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
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<Sentence> getSentences(String text) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<SentencePart> getTextParts(String text) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<String> getTextWords(String text) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<String> getTextNumbers(String text) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<SentencePartImp> getTextSigns(String text) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<Sentence> findSentencesWithMostSameWords(Text text) {
	// TODO Auto-generated method stub
	return null;
    }

}
