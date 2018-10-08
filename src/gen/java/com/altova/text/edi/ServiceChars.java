////////////////////////////////////////////////////////////////////////
//
// ServiceStringAdvice.java
//
// This file was generated by MapForce 2018r2sp1.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////

package com.altova.text.edi;

import java.io.Writer;
import java.io.IOException;

public class ServiceChars {

	public static final byte None=0;
	public static final byte ComponentSeparator = 1;
	public static final byte DataElementSeparator = 2;
	public static final byte SegmentTerminator = 3;
	public static final byte ReleaseCharacter = 4;
	public static final byte DecimalSeparator = 5;
	public static final byte RepetitionSeparator = 6;
    public static final byte SubComponentSeparator = 7;
	public static final byte SegmentSeparator = 8;
	
	char[] mSeparators = "\0:+\\?.!&+".toCharArray();
	
	public char getSeparator(byte sep)
	{
		return sep>8?'\0':mSeparators[sep];	
	}
	
	public char getComponentSeparator() {
		return mSeparators[ComponentSeparator];
	}

	public void setComponentSeparator(char componentSeparator) {
		mSeparators[ComponentSeparator] = componentSeparator;
	}

	public char getDataElementSeparator() {
		return mSeparators[DataElementSeparator];
	}

	public void setDataElementSeparator(char dataElementSeparator) {
		mSeparators[DataElementSeparator] = dataElementSeparator;
	}

	public char getDecimalSeparator() {
		 return mSeparators[DecimalSeparator];
	}

	public void setDecimalSeparator(char decimalSeparator) {
		mSeparators[DecimalSeparator] = decimalSeparator;
	}

	public char getReleaseCharacter() {
		return mSeparators[ReleaseCharacter];
	}

	public void setReleaseCharacter(char releaseCharacter) {
		mSeparators[ReleaseCharacter] = releaseCharacter;
	}

	public char getSegmentSeparator() {
		return mSeparators[SegmentSeparator];
	}

	public void setSegmentSeparator(char segmentSeparator) {
		mSeparators[SegmentSeparator] = segmentSeparator;
	}
	
	public char getSegmentTerminator() {
		return mSeparators[SegmentTerminator];
	}

	public void setSegmentTerminator(char segmentTerminator) {
		mSeparators[SegmentTerminator] = segmentTerminator;
	}
	
	public char getRepetitionSeparator() {
		return mSeparators[RepetitionSeparator];
	}

	public void setRepetitionSeparator(char repetitionSeparator) {
		mSeparators[RepetitionSeparator] = repetitionSeparator;
	}
    
	public char getSubComponentSeparator() {
		return mSeparators[SubComponentSeparator];
	}

	public void setSubComponentSeparator(char subcomponentSeparator) {
		mSeparators[SubComponentSeparator] = subcomponentSeparator;
	}
	
	public int serialize(Writer stream) throws IOException {
		StringBuffer out = new StringBuffer();
		out.append("UNA");
		out.append(getComponentSeparator());
		out.append(getDataElementSeparator());
		out.append(getDecimalSeparator());
		if( getReleaseCharacter() != '\0' )
			out.append(getReleaseCharacter());
		else
			out.append( ' ');

		if( getRepetitionSeparator() != '\0' )
			out.append(getRepetitionSeparator());
		else
			out.append( ' ');

		out.append(getSegmentTerminator());
		stream.write( out.toString() );
		return out.length();
	}

	public boolean mustEscape(char ch) {
		return ch == mSeparators[ComponentSeparator]
		    || ch == mSeparators[DataElementSeparator]
		    || ch == mSeparators[ReleaseCharacter]
		    || ch == mSeparators[RepetitionSeparator]
		    || ch == mSeparators[SegmentSeparator]
		    || ch == mSeparators[SegmentTerminator]
		    || ch == mSeparators[SubComponentSeparator];
	}
}
