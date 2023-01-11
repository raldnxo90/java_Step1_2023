package chapter03.FOR;

public class forTest13 {

	public static void main(String[] args) {

		int i, j;

		for (i = 2; i < 10; i++) {
			for (j = 1; j < 10; j++) {// i가 2일 때, j는 1...9까지
				System.out.println(i + " * " + j + " = " + (i * j));

			}
		}
		System.out.println("==================");

	}

}
