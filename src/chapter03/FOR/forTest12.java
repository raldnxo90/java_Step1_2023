package chapter03.FOR;

public class forTest12 {

	public static void main(String[] args) {

		int x, y;

		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {// x=1 -> y=1, 2, 3...10

				if (4 * x + 5 * y == 60) {
					System.out.println(x + ", " + y);
				} // if
			} // if for
		} // out for

	}

}
