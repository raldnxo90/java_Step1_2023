package chapter05;

import java.util.Scanner;

public class Method {

	// 멤버변수(=필드)

	// 생성자 생략

	// 메소드

	void makeBread() {// public 생략
		System.out.println("빵을 만듭니다");
	}// method1

	void makeBread(int count) {// public 생략
		// 1번째 빵을 만들었습니다
		// 2번째 빵을 만들었습니다

		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 빵을 만들었습니다");
			/*
			 * if(i==count) { System.out.println("요청하신 "+(i+1)+"개의 빵이 모두 완료되었습니다"); }
			 */
		}
		System.out.println("요청하신 " + count + "개의 빵이 모두 완료되었습니다");

	}// method2

	void makeBread(int count, String name) {// public 생략
		// 1번째 빵을 만들었습니다
		// 2번째 빵을 만들었습니다

		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 " + name + "빵을 만들었습니다");
			/*
			 * if(i==count) { System.out.println("요청하신 "+(i+1)+"개의 빵이 모두 완료되었습니다"); }
			 */
		}

	}

	void order() {

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int count, num;
		String name;

		while (run) {
			System.out.println("1.빵 개수 선택 | 2.빵의 개수와 종류 | 3.종료");
			System.out.print("선택 > ");
			num = scan.nextInt();

			if (num == 1) {
				System.out.print("주문할 빵의 갯수 : ");
				count = scan.nextInt();
				makeBread(count);

			} else if (num == 2) {
				System.out.print("주문할 빵의 갯수 : ");
				count = scan.nextInt();

				System.out.print("주문할 빵의 종류 : ");
				name = scan.next();

				makeBread(count, name);

			} else if (num == 3) {
				System.out.println("프로그램 종료");
				run = false;
			}

			System.out.println("---------------------------------------");
		}

	}
}