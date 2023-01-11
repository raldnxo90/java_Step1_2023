package chapter03.FOR;

import java.util.Scanner;

public class forTest13_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력하시오 : ");

		int i;
		int b = scan.nextInt();

		for (i = 1; i <= 9; i++) {
			System.out.println(b + " * " + i + " = " + b * i);
		}

	}// 메인

}// 클래스
