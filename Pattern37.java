package com.practice.patternprogram;

//A B C D E 
//F G H I J 
//K L M N O 
//P Q R S T 
//U V W X Y 


public class Pattern37 {
	
	public static void main(String[] args) {
		
		char letter = 'A';
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5; j++) {
				
				System.out.print(letter+" ");
				letter++;
				
			}
			
			System.out.println();
			
		}
		
	}

}
