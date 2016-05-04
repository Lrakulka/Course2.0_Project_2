package com.homework.analyzer;

import java.util.List;

import com.homework.parts.*;
import com.homework.parts.Number;

public interface Analyzer {
    String REAPLECE_SYMBOLS = "(\\s{2,})|(\t)";
    String CHANGE_TO_CHARACTER = " ";
    String PARAGRAPH = ".+\u2029$|\\z";
    String SENTENCE = ".+(.+)|(!+)|?|;|$";
    String WORD = "(\\w*[a-zA-Z]+\\w*)|([a-zA-Z_]+\\w*)";
    String NUMBER = "([-]?[0-9]+(.[0-9]+)?)|";
    String SIGN = "(\\p{Punct}+)|(\\p{Blank}+)";
    /**
     * Filter text. Change all tabs and repeated spaces to space.
     * @param text - text which need to be filtered
     * @return filter text
     */
    String filterText(String text);
    
    /**
     * Returns list of paragraphs of text.
     * @param text which need to split by paragraphs
     * @return list of paragraphs
     */
    List<Paragraph> getParagraphs(String text);
    
    /**
     * Return list of sentences from text.
     * @param text
     * @return list of sentences
     */
    List<Sentence> getSentences(String text);
    
    /**
     * Return list of words in text.
     * @param text
     * @return list of words
     */
    List<Word> getTextWords(StringBuilder text);
    
    /**
     * Return list of numbers from input text.
     * @param text
     * @return list of numbers
     */
    List<Number> getTextNumbers(StringBuilder text);
    
    /**
     * Return list of input text signs - [.,',,,! and so on..
     * @param text
     * @return list of signs
     */
    List<Sign> getTextSigns(StringBuilder text);
    
    /**
     * Return list of sentences which contains the most common words.
     * @param text - source of research
     * @return list of sentence or 
     * empty list if sentences with same words didn't found
     */
    List<Sentence> sortSentencesByWordsCount(Text text);
}
