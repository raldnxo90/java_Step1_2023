package chapter05;

import java.util.Scanner;

public class FunTest07 {

	public FunTest07() {
	
	}//생성자
	
	/*public static String Edustep(int edu) {
		
		String step;
		
		if(edu==1) {
			step="1단계";
		}else if (edu==2){
			step="2단계";
		}
		else if (edu==3) {
			step="3단계";
		}else {
			step="해당하는 스터디 단계가 없습니다";
		}
		
		return step;
	}//메소드
	*/
	
	public static void Edustep(int edu) {
		
		if(edu==1) {
			System.out.println("현재 단계는 step1입니다");
		}else if (edu==2){
			System.out.println("현재 단계는 step2입니다");
		}
		else if (edu==3) {
			System.out.println("현재 단계는 step3입니다");
		}else {
			System.out.println("해당하는 스터디 단계가 없습니다");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요 : ");
		int number=scan.nextInt();
		
		/*리턴 값이 있는 경우
		String step = Edustep(number);
		System.out.println("현재 수업 단계는 : " + step+ "입니다");
		System.out.println("현재 수업 단계는 : " + Edustep(number)+ "입니다");
		*/
		
		//리턴 값이 없는 경우
		Edustep(number);
		
		
		
	}

}
