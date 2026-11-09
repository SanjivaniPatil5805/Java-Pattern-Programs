package com.practice.patternprogram;

//1 2 3 4 5 
//2 3 4 5 6 
//3 4 5 6 7 
//4 5 6 7 8 
//5 6 7 8 9 

public class Pattern27 {
	
	public static void main(String[] args) {
		
		int n = 5, num = 1, temp = 1;
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n; j++) {
				
				System.out.print(num+" ");
				num++;
				
			}
			
			num = temp + 1;
			temp++;

			
			 System.out.println();
			
		}
		
		System.out.println("--------------------------");
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n; j++) {
				
				System.out.print(i + j - 1+" ");
				
			}
			
			System.out.println();
			
		}
		
	}

}
