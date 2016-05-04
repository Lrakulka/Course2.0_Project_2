/**
 * 
 */
package com.homework.parts;

/**
 * @author asd
 *
 */
public class Number implements SentencePart<Integer> {
    private int number;
    private int position;
    
    public Number(int number, int position) {
	this.number = number;
	this.position = position;
    }

    /* (non-Javadoc)
     * @see com.homework.parts.SentencePart#getPart()
     */
    @Override
    public Integer getPart() {
	return number;
    }

    /* (non-Javadoc)
     * @see com.homework.parts.SentencePart#getPartPosition()
     */
    @Override
    public int getPartPosition() {
	return position;
    }

}
