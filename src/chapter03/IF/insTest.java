package chapter03.IF;

class clsA {

	void fun() {
		System.out.println("2023년 1월 첮주 월요일 입니다");
	}// fun
}// clsA

class clsB extends clsA {

}//clsB, clsA를 상속받음

public class insTest {

	public static void main(String[] args) {
		//clsB의 인스턴스 변수
		clsB objB=new clsB();
		
		if(objB instanceof clsA) {
			System.out.println("Yes");
			objB.fun();
		}//if, instanceof: 클래스 안에 클래스가 있는지 확인
		
		if(objB instanceof clsB) {
			System.out.println("Yes");
		}//if
	}//main

}//InsTest class
