package chapter03.FOR;

import java.util.Scanner;

public class forTest17 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된 수만큼 ★ ㅁ 출력

		int i, j, k, n;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		n = scan.nextInt();
		//전체 회전수
		for (i = 0; i < n; i++) {//공백
			for (j = 0; j <= n - 1 - i; j++) {
				System.out.print(" ");
			}//별
			for (j = 0; j < 2 * i + 1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	}

}
