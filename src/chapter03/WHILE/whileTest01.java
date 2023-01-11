package chapter03.WHILE;

public class whileTest01 {

	public static void main(String[] args) {
		int num;
		while(true) {
			
			int num1=(int)(Math.random()*6)+1;
			System.out.println("주사위의 눈 : "+num1);
			
			if(num1==6) {
				break;
			}//if문
		}//while문
		System.out.println("프로그램 종료");

	}

}	