package chapter03.Example;

import java.util.Scanner;

public class Example_While03_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num, money, total = 0;
		boolean run = true, run2 = true;

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금하기|2.출금하기|3.잔액확인|4.종료하기");
			System.out.println("-----------------------------------");

			System.out.print("선택 > ");
			num = scan.nextInt();

			if (num == 1) {
				System.out.print("예금할 금액을 입력하세요 > ");
				money = scan.nextInt();
				if (money <= 0) {
					System.out.println("잘못된 입력입니다");
				} else {
					total += money;
					System.out.println("현재금액은 : " + total + "원");
				}
			} else if (num == 2) {
				System.out.print("출금할 금액을 입력하세요 > ");
				money = scan.nextInt();
				if (money <= 0) {
					System.out.println("잘못된 입력입니다");
					break;
				}
				if (total < money) {
					System.out.println("잔액이 부족합니다");
					break;
				}
				total -= money;
				System.out.println("현재금액은 : " + total + "원");
			} else if (num == 3) {
				System.out.println("현재 잔고는 : " + total + "원");
			} else if (num == 4) {
				run = false;
				run2 = false;
				System.out.println("프로그램을 종료합니다");
			} else {
				System.out.println("잘못된 입력입니다");
			} // if문-출력화면
			if (run2) {
				System.out.println("-------------------------------------------");
				System.out.println("종료는 1번, 초기화면으로 돌아가려면 아무번호를 누르세요");
				System.out.println("-------------------------------------------");
				num = scan.nextInt();
				if (num == 1) {
					System.out.println("프로그램을 종료합니다");
					break;
				} // if문 종료 여부
			} // if문-초기화면 복귀 여부

		} // while문
}

}
