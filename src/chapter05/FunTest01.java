package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {
	/*
	 * //합계 메서드(함수) //접근한정자 : public(공용 : 제한없음), protected(패키지 내에서 공융으로 사용),
	 * private(클래스 내) //void : return 없음 public static void sum(int num1, int num2)
	 * {//()가매개변수 //int num1=2; //int num2=5; int total=num1+num2;
	 * System.out.println(total);
	 */

	public static void main(String[] args) { // main 메서드(실행을 담당)
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		sum(a, b);// 실매개변수

	}// 메인 메서드
	
	//메인을 기준으로 하여 메인선언 전 또는 후에 정의해도 됨
	public static void sum(int num1, int num2) {// sum 메서드 (가매개변수)
		// int num1=2;
		// int num2=5;
		int total = num1 + num2;
		System.out.println(total);

	}// sum 메서드
	
}// 클래스