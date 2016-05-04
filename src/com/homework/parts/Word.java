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

}
