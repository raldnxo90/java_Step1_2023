package chapter03.FOR;

public class forTest16 {

	public static void main(String[] args) {
		int i, j;

		for (i = 2; i < 10; i++) {
			System.out.print("[" + i + "단" + "]" + "\t");
		}
		System.out.println();

		for (i = 1; i < 10; i++) {

			for (j = 2; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");

			}
			System.out.println();

		}

	}

}
