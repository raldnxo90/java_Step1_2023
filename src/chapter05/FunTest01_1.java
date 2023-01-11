package chapter05;

import javax.swing.JOptionPane;

public class FunTest01_1 {
	
	//합계 메서드(함수)
	//접근한정자 : public(공용 : 제한없음), protected(패키지 내에서 공융으로 사용), private(클래스 내)
	//void : return 없음
	public static void name(String nam1, String nam2) {//()가매개변수
		//int num1=2;
		//int num2=5;
		System.out.print(nam1+nam2);
		
	}
	
	public static void sum(int a, int b, int c, int d) {
	
		System.out.println(a+b+c+d);
	}
	
	public static void main(String[] args) { //main 메서드(실행을 담당)
		String a, b;
		int c, d, e, f;
		a=JOptionPane.showInputDialog("성");
		b=JOptionPane.showInputDialog("이름");
		
		c=Integer.parseInt(JOptionPane.showInputDialog("데이터베이스 점수 > "));
		d=Integer.parseInt(JOptionPane.showInputDialog("자료구조론 점수 > "));
		e=Integer.parseInt(JOptionPane.showInputDialog("소프트웨어공학 점수 > "));
		f=Integer.parseInt(JOptionPane.showInputDialog("정보보호론 점수 > "));
		
		name(a,b);//실매개변수
		System.out.print("의 점수 합은 ");
		sum(c, d, e, f);
		
		
	}//메인 메서드
	
}//클래스
