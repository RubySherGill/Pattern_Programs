
public class StarPattern {
	public static void main(String[] args) {

		System.out.println("Pattern 1");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		System.out.println("\nPattern 2");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		System.out.println("\nPattern 3");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		System.out.println("\nPattern 4");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= 6 - i) {
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nPattern 5");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nPattern 6");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 2; j <= 6 - i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		System.out.println("\nPattern 7");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= 6 - i) {
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		System.out.println("Pattern 3");
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}

//		System.out.println("Pattern 4");
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}

		System.out.println("\nPattern 8");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

//		System.out.println("Pattern 9");
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j >= i; j--) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}

		System.out.println("\nPattern 9");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i || j >= 10 - i) {
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nPattern 10");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= 6 - i || j <= i - 4) {
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nPattern 11");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if ((j <= 6 - i || j <= i - 4) || (j >= 4 + i || j >= 14 - i)) {
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nPattern 12");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if ((j >= 6 - i && j >= i - 4) && (j <= 4 + i && j <= 14 - i)) {
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nPattern 13");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if ((j <= i && j <= 10 - i) || (j >= 10 - i && j >= i)) {
					System.out.print("*" + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		for (int i = 1; i <= 5; i++) {
//			for (int k = 1; k <= 5 - i; k++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}

	}

}
