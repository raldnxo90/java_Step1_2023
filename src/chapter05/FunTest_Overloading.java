package chapter05;

public class FunTest_Overloading {

	
	//필드=멤버변수
	
	//생성자(디폴트 생략)
	
	//다형성 만족
	//Overloading : 메소드 명을 통일성 있게 사용해야하는 경우, 메소드의 매개변수를 종류와 갯수를 다르게하여 구현
	
	public void getResult(int n) {
		System.out.println(n + "은(는) int입니다");
	} 
	public void getResult(String n) {
		System.out.println(n + "은(는) String입니다");
	} 
	public void getResult(char n) {
		System.out.println(n + "은(는) char입니다");
	} 
	public void getResult(int n, String m) {
		System.out.println(n+"와 "+m + "은(는) int와 String 입니다");
	} 
	
}
