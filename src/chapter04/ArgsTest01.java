package chapter04;

import javax.swing.JOptionPane;

public class ArgsTest01 {

	public static void main(String[] args) {
		//배열선언1
		int a[]=new int[5];//Fixed-length
		
		//배열선언2
		int b[];
		b=new int[5];
		
		int aVal;
		int bVal;
		int Tot;
		
		//배열선언3
		String[] str;
		str=new String [5];
		
		//배열선언4
		args=new String[2];
		args[0]="1";//[0]:첨자 / "0":요소
		args[1]="2";
		
		//1ength : 배열의 첨자 (메모리) 수 
		if(args.length == 2) {
			int sum=0;//지역변수
			aVal=Integer.parseInt(args[0]);
			bVal=Integer.parseInt(args[1]);
		}else {
			aVal=0;
			bVal=0;
		}//if문
		
			Tot=aVal+bVal;
			System.out.println(Tot);
			
			
			
	}//메인

}//클래스
