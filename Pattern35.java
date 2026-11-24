package com.practice.patternprogram;

//0 1 0 1 0 
//0 1 0 1 0 
//0 1 0 1 0 
//0 1 0 1 0 
//0 1 0 1 0 


public class Pattern35 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5; j++) {
				
				if(j % 2 == 1) {
					
					System.out.print("0 ");
					
				} else {
					
					System.out.print("1 ");
					
				}
				
			}
			
			System.out.println();
			
		}
		
	}
	
}
