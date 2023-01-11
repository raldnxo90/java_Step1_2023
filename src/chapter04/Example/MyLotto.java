package chapter04.Example;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
		//로또 예상번호
		
		int number;
		int cnt=0;
		int lotto[]=new int[6];
		int lotto1;
		
		System.out.println("====이번주 로또 예상번호====");
		number=Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요"));
		
		while (number > cnt) {
			
			System.out.print("["+(cnt+1)+"] : " );
			for(int i=0;i<lotto.length;i++) {
			
				/*
			lotto1=(int)(Math.random()*100+1);
				if(lotto[i]==lotto1) {
				break;	
				}else {
					lotto[i-1]=lotto1;
				}
				*/
				
				
			System.out.print(lotto[cnt]+ "   ");
			}
			
			System.out.println();
			cnt++;
			
			
		}//while문
		
	}//메인

}//클래스
