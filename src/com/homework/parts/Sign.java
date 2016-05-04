/**
 * 
 */
package com.homework.parts;

/**
 * @author asd
 *
 */
public class Sign implements SentencePart<Character> {
    private char sign;
    private int position;
    
    public Sign(char sign, int position) {
	this.position = position;
	this.sign = sign;
    }
    
    /* (non-Javadoc)
     * @see com.homework.parts.SentencePart#getPart()
     */
    @Override
    public Character getPart() {
	return Character.valueOf(sign);
    }

    /* (non-Javadoc)
     * @see com.homework.parts.SentencePart#getPartPosition()
     */
    @Override
    public int getPartPosition() {
	return position;
    }

}
