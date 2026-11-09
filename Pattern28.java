package com.practice.patternprogram;

//1 3 5 7 9 
//3 5 7 9 11 
//5 7 9 11 13 
//7 9 11 13 15 
//9 11 13 15 17 

public class Pattern28 {

	public static void main(String[] args) {

		int n = 5, num = 1, temp = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {

				System.out.print(num + " ");
				num = num + 2;
			}

			num = temp + 2;
			temp = temp + 2;

			System.out.println();

		}

		System.out.println("--------------------------");

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {

				System.out.print(2 * (i + j) - 3 +" ");

			}

			System.out.println();

		}

	}

}
