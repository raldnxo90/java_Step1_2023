package chapter03.Example;

import java.util.Scanner;

public class Example_While02 {

	public static void main(String[] args) {

		boolean run = true;

		int balance = 0;
		int input;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("==============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("==============================");
			System.out.print("선택 > ");
			int num = scan.nextInt();
			int num2;

			switch (num) {
			case 1: // 0이하의 금액이 입력되었을 때 예외처리
				System.out.print("예금액 > ");
				input = scan.nextInt();
				if (input <= 0) {
					System.out.println("잘못된 금액을 입력하였습니다");
					break;
				}
				balance += input;
				System.out.println("현재금액 : " + balance+ "원");
				break;
			case 2:// 잔액이 부족합니다
				System.out.print("출금액 > ");
				input = scan.nextInt();
				if (input <= 0) {
					System.out.println("잘못된 금액을 입력하였습니다");
					break;
				}
				if (input > balance) {
					System.out.println("잔액이 부족합니다");
					break;
				}
				balance -= input;
				System.out.println("현재금액 : " + balance+"원");
				break;
			case 3:
				System.out.println("남은 잔고는 " + balance+ "원");
				break;
			case 4:
				System.out.println("종료합니다");
				run = false;
				break;
			default:
				System.out.println("숫자를 잘못 입력하셨습니다");
			}
			
		}

	}

}