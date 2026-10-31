package com.practice.patternprogram;

//abcde
//abcd
//abc
//ab
//a

public class Pattern5 {
	
	public static void main(String[] args) {
			
			for (char i = 'e'; i >= 'a'; i--) {

				for (char j = 'a'; j <= i; j++) {

					System.out.print(j);

				}

				System.out.println();

			}
		
	}

}
