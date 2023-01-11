package chapter03.FOR;

import java.util.Scanner;

public class forTest17_1 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된 수만큼 ★ ㅁ 출력

		int i, j, a;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		a = scan.nextInt();

		for (i = 1; i <= a; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("★");

			}
			System.out.println();
		}

	}

}
