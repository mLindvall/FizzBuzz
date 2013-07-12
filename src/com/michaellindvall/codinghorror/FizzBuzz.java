package com.michaellindvall.codinghorror;

/**
 * Write a program that prints the numbers from 1 to 100. 
 * But for multiples of three print "Fizz" instead of the 
 * number and for the multiples of five print "Buzz". 
 * For numbers which are multiples of both three and 
 * five print "FizzBuzz".
 * 
 * 
 * @author mlin014
 * @see http://www.codinghorror.com/blog/2007/02/why-cant-programmers-program.html
 *
 */
public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0))
				System.out.println("FizzBuzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else System.out.println(i);
		}
		
		System.out.println("my factorial " + factorial(5));
	}	
	
	
	private static int factorial(int n) {
		if (n <= 1) return 1;
		else return n*factorial(n-1);
		
	}
}
