package chapter03.FOR;

import java.util.Scanner;

public class forTest08 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하시오
		Scanner scan = new Scanner(System.in);
		int a, cnt3 = 0, cnt5 = 0;

		for (a = 1; a <= 10; a++) {
			System.out.print("정수를 입력하세요 : ");
			int b = scan.nextInt();
			if (b % 3 == 0) {
				System.out.println(b + "은(는) 3의 배수입니다");
				cnt3++;
			} // if문
			if (b % 5 == 0) {
				System.out.println(b + "은(는) 5의 배수입니다");
				cnt5++;
			}
		} // for문
		System.out.println("3의 배수는 " + cnt3+"개입니다");
		System.out.println("5의 배수는 " + cnt5+"개입니다");

	}// 메인

}// 클래스
