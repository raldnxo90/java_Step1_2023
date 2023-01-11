package chapter03.FOR;

public class forTest11 {

	public static void main(String[] args) {

		int i, j;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			} // 내부for문

		} // 외부for문

	}// 메인

}// 클래스
