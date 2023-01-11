package chapter03.IF;

import java.util.Scanner;

public class ifExample10 {

	public static void main(String[] args) {

		String ID = "soldesk";
		int PW = 221227;
		Scanner scan = new Scanner(System.in);

		System.out.print("아이디 : ");
		String inputID = scan.nextLine();

		if (ID.equals(inputID)) {
			System.out.print("비밀번호 : ");
			String inputPW = scan.next();
			if (PW == Integer.parseInt(inputPW)) {
				System.out.println("로그인 성공");

			} else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}

		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}// main

}// class
