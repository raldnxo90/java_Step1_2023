package chapter05;

import javax.swing.JOptionPane;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {
		
		FunTest_Overloading obj=new FunTest_Overloading();
		
		String a = "주말";
		int b = 33;
		char c = 'B';
		
		obj.getResult("주말");
		obj.getResult(b);
		obj.getResult(c);
		
		obj.getResult(b, a);
		
		
	}

}

