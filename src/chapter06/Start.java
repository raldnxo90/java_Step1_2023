package chapter06;

import java.util.Random;

public class Start {
	
	private int random = new Random().nextInt(50)+1;//1에서 50까지의 정수에서 추출
	private int count = 0;
	private String result = "FAIL";
	
	public String check(int mynumber) {
		
		count ++;
		
		if(mynumber<random) {
			System.out.println("up");
		}
		
		else if (mynumber>random) {
			System.out.println("down");
		}
		
		else { 
			System.out.println(count+"번만에 성공");
			result = "SUCCESS";
		}
		return result;
		}
		
	}
		//random 값보다 작으면 up / 크면 down / 일치하면 -> result = "SUCCESS"
	
	
	
	

