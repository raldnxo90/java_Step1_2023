package chapter05;

import javax.swing.JOptionPane;

public class FunTest06_1 {
	
	
	public String volumn;
	
	public void channel(int num){
		System.out.println(num+"번으로 바꿔라");
	}
	
	public void sound(int volumn) {
		
		System.out.println("볼륨을 "+volumn+"만큼 높여라");
	}
	
	public void sound(String volumn) {
		this.volumn=volumn;
		System.out.println("볼륨을"+volumn+"만큼 내려라");
	
	}
	
	public static void main(String[] args) {
		
		FunTest06_1 tv=new FunTest06_1();
		
		tv.channel((int)(Math.random()*10));
		tv.sound(Integer.parseInt(JOptionPane.showInputDialog("볼륨을 입력해라")));
		tv.sound(JOptionPane.showInputDialog("볼륨을 입력해라2"));
	}

}
