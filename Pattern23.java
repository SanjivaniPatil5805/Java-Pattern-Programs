package com.practice.patternprogram;

//     *
//    * *
//   *   *
//  *     *
// *       *
//  *     *
//   *   *
//    * *
//     *


public class Pattern23 {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {

				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) {

				if (i == 1 || j == 1) {

					System.out.print("*");

				} else {

					System.out.print(" ");

				}

			}

			for (int j = 1; j <= i - 1; j++) {

				if (i - j == 1) {

					System.out.print("*");

				} else {

					System.out.print(" ");

				}

			}

			System.out.println();

		}

		for (int i = 1; i <= n - 1; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" ");

			}

			for (int j = 1; j <= n - i; j++) {
				
				
                 if(j == 1) {
                	 
                	 System.out.print("*");
                	 
                 } else {
                	 
                	 System.out.print(" ");
              	 
                 }

			}

			for (int j = 1; j <= n - 1 - i; j++) {

				if(j == n - 1 - i) {
					
					System.out.print("*");
					
				} else {
					
					System.out.print(" ");
					
				}

			}

			System.out.println();

		}

	}

}
