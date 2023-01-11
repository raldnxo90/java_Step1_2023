package chapter03.Example;

import java.util.Scanner;

public class Example_While01 {

	public static void main(String[] args) {

		boolean run = true;

		int balance = 0;
		int input;
		int output;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("==============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("==============================");
			System.out.print("선택 > ");
			int num = scan.nextInt();

			switch (num) {
			case 1:
				System.out.print("예금액 > ");
				input = scan.nextInt();
				balance += input;
				break;
			case 2:
				System.out.print("출금액 > ");
				output = scan.nextInt();
				balance -= output;
				break;
			case 3:
				System.out.println("남은 잔고는 " + balance);
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
