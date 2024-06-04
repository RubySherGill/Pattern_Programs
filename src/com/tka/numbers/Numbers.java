package com.tka.numbers;

public class Numbers {
	public static void main(String[] args) {
		System.out.println("Pattern 1");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("0" + " ");
				} else {
					System.out.print("1" + " ");
				}
			}
			System.out.println();
		}

		System.out.println("\nPattern 2");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 != 0) {
					System.out.print("0" + " ");
				} else {
					System.out.print("1" + " ");
				}
			}
			System.out.println();
		}

		System.out.println("\nPattern 3");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print("0" + " ");
				} else {
					System.out.print("1" + " ");
				}
			}
			System.out.println();
		}

		System.out.println("\nPattern 4");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0) {
					System.out.print("0" + " ");
				} else {
					System.out.print("1" + " ");
				}
			}
			System.out.println();
		}

		System.out.println("\nNumber Pattern");
		int count = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				System.out.print(count + " ");
			}
			System.out.println();
		}
		
       }

}
