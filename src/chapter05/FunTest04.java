package chapter05;

import javax.swing.JOptionPane;

public class FunTest04 {
	
	public static void Disp(String A[]) {
		String res=null;
		
		/*
		for(int i=0;i<A.length;i++) {
			res=A[i];
			System.out.println(res);
		
		}//for문
		 */
		
		for(String str:A) {
			res+=str+" ";
		}
		
		
		System.out.println(res);//확장 for문
		JOptionPane.showInputDialog("배열의 원소값\n\n");
	}

	public static void main(String[] args) {
		String str[]= {"Java", "Oracle", "Jsp", "Html5, Css, Js, Jq", "SprintBoot", "PythonCamp"};
		
		Disp(str);
	}

}
