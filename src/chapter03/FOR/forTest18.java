package chapter03.FOR;

import java.util.Scanner;

public class forTest18 {

	public static void main(String[] args) {

		// 정수를 입력받아서 입력된 수만큼 ★ 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int i, j, k;
		int n = scan.nextInt();
		
		for (i = 0; i < n; i++) {
			
			for (j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			
			for (k = 0; k <= i; k++) {

				System.out.print("★");
			}
			System.out.println();
		}
	}

}
