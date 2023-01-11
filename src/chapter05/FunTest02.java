package chapter05;

import javax.swing.JOptionPane;

public class FunTest02 {
	/*
	 * //합계 메서드(함수) //접근한정자 : public(공용 : 제한없음), protected(패키지 내에서 공융으로 사용),
	 * private(클래스 내) //void : return 없음 public static void sum(int num1, int num2)
	 * {//()가매개변수 //int num1=2; //int num2=5; int total=num1+num2;
	 * System.out.println(total);
	 */

	/*
	public FunTest02() {
	}//생성자-클래스 생성 시 힙 메모리에 할당
	*/
	
	public static void main(String[] args) { // main 메서드(실행을 담당)
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		//static에서 호출되지 않았으므로 Error발생
		//sum(a, b);// 실매개변수
		
		FunTest02 obj=new FunTest02();
		obj.sum(a, b);
		
	}// 메인 메서드
	
	//메인을 기준으로 하여 메인 선언 전 또는 후에 정의해도 됨
	public void sum(int num1, int num2) {// ()가매개변수
		// int num1=2;
		// int num2=5;
		int total = num1 + num2;
		System.out.println(num1+"+"+num2+"="+total);

	}// sum 메서드
	
}// 클래스