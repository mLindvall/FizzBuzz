package com.michaellindvall.codinghorror;

/**
 * "What's the number after F in hexadecimal?"
 * 
 * This program just loops to 100 printing the hex values.
 * 
 * @author mlin014
 * @see http://www.codinghorror.com/blog/2007/02/why-cant-programmers-program.html
 * 
 */
public class HexadecimalLoop {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			//System.out.println(i + "\t=\t" + Integer.toHexString(i));
		}
		
		String msg =  "The number after F in hexadecmial is ";
		String num = Integer.toHexString(Integer.parseInt("f", 16) + 1);
		System.out.println(msg +  num);

	}

}
