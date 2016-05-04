/**
 * 
 */
package com.homework.parts;

/**
 * @author asd
 *
 */
public class Word implements SentencePart<String> {
    private String word;
    private int position;
    
    public Word(String word, int position) {
	this.position = position;
	this.word = word;
    }
    
    /* (non-Javadoc)
     * @see com.homework.parts.SentencePart#getPart()
     */
    @Override
    public String getPart() {
	return word;
    }

    /* (non-Javadoc)
     * @see com.homework.parts.SentencePart#getPartPosition()
     */
    @Override
    public int getPartPosition() {
	return position;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return word;
    }
}
