package com.practice.patternprogram;

//E E E E E 
//D D D D D 
//C C C C C 
//B B B B B 
//A A A A A 

public class Pattern40 {
	
	public static void main(String[] args) {
		
		for (char i = 'E'; i >= 'A'; i--) {

			for (char j = 'A'; j <= 'E'; j++) {

				System.out.print(i+" ");

			}

			System.out.println();

		}
		
	}

}
