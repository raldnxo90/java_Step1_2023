package chapter05;

import java.nio.channels.Channel;
import java.util.Scanner;

public class FunTest05 {
	
	public String channel; //멤버변수
	public int channelInt;//멤버변수
	public int volume;//멤버변수
	
	
	
	public void channelUp(int volume) {
		System.out.println("소리를 "+volume+"만큼 올립니다");
	}

	public void channelDown(int volume) {
		System.out.println("소리를 "+volume+"만큼 내립니다");
	}
	
	public void channelChange(String channel) {
		System.out.println("TV 채널을 "+channel+"로 바꿉니다");
	}
	//오버로딩=메서드 이름은 같은데, 매개변수가 다름(다형성 만족)
	public void channelChange(int channelnt) {
		System.out.println("채널을 "+channelInt+"로 바꿉니다");
	}
	
	public static void main(String[] args) {
		
		FunTest05 tv=new FunTest05();
		int i;
		
		tv.channelUp((int)(Math.random()*10));
		tv.channelDown(2);
		tv.channelChange("TvN");
		tv.channelDown(5);
		
		
	}

}
