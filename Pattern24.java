package com.practice.patternprogram;

//     *        *
//    ***      ***
//   *****    *****
//  *******  *******
// ******************
//  *******  *******
//   *****    *****
//    ***      ***
//     *        *


public class Pattern24 {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {

				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			for (int j = 1; j <= i - 1; j++) {

				System.out.print("*");

			}
			
			for(int j = 1; j <= 2*(n - i) ; j++) {
				
				System.out.print(" ");
				
			}
			
			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}
			
			for (int j = 1; j <= i - 1; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

		for (int i = 1; i <= n - 1; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" ");

			}

			for (int j = 1; j <= n - i; j++) {

				System.out.print("*");

			}

			for (int j = 1; j <= n - 1 - i; j++) {

				System.out.print("*");

			}
			
			for (int j = 1; j <= 2 * i; j++) {

				System.out.print(" ");

			}
			
			for (int j = 1; j <= n - i; j++) {

				System.out.print("*");

			}

			for (int j = 1; j <= n - 1 - i; j++) {

				System.out.print("*");

			}
			

			System.out.println();

		}
		
		

	}

}
