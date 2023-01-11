package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int select;
		String check;
		Start st = new Start();
		
		//객체 생성
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			select = scan.nextInt();
			check = st.check(select);
			
			if(check.equals("SUCCESS")) {
				break;
			}
			
		}//while문
		
		/*do {
		  System.out.print("숫자를 입력하세요 : ");
		  select = scan.nextInt();
		  }
		 while (st.check(select).equals("FAIL"));
			
		}*/
	}

}
