package chapter03.IF;

import java.util.Scanner;

public class ifExample11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("소프트웨어 설계 점수 입력 : ");
		String inputsoft1 = scan.nextLine();
		int soft1 = Integer.parseInt(inputsoft1);

		System.out.print("소프트웨어 개발 점수 입력 : ");
		String inputsoft2 = scan.nextLine();
		int soft2 = Integer.parseInt(inputsoft2);

		System.out.print("데이터베이스 구축 점수 입력 : ");
		String inputDB = scan.nextLine();
		int DB = Integer.parseInt(inputDB);

		System.out.print("프로그래밍 언어 활용 점수 입력 : ");
		String inputpro = scan.nextLine();
		int pro = Integer.parseInt(inputpro);

		System.out.print("정보시스템 구축 점수 입력 : ");
		String inputOS = scan.nextLine();
		int OS = Integer.parseInt(inputOS);

		int avg = ((soft1 + soft2 + DB + pro + OS) / 5);

		if ((soft1 > 8) && (soft2 > 8) && (DB > 8) && (pro > 8) && (OS > 8)) {
			if (avg > 60)
				System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}

	}

}
