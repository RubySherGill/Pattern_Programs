package com.tka.alphabets;

public class Alphabets {
	public static void main(String[] args) {
		System.out.println("Pattern 1");
		for(char i='A';i<='E';i++) {
			for(char j='A';j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern 2");
		for(char i='A';i<='E';i++) {
			for(char j='A';j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern 3");
		for(char i='E';i>='A';i--) {
			for(char j='A';j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern 4");
		for(char i='A';i<='E';i++) {
			for(char j='A';j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern 5");
		for(char i='E';i>='A';i--) {
			for(char j='E';j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nPattern 6");
		for(char i='A';i<='E';i++) {
			for(char j='E';j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
