package chapter03.IF.SWITCH;

import javax.swing.JOptionPane;

public class Switchase02 {

	public static void main(String[] args) {
		// 1:예금조회 2:출금 3:입금 4:송금

		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("번호를 입력하시오"));

		switch (num) {
		case 1:
			System.out.println("예금조회");
			break;
		case 2:
			System.out.println("출금");
			break;
		case 3:
			System.out.println("입금");
			break;
		case 4:
			System.out.println("송금");
			break;

		default:
			System.out.println("번호를 잘못 입력했습니다");
			break;
		}//switch

	}//main

}//class
