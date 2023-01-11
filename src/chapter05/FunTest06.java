package chapter05;

public class FunTest06 {

	public String channel1;
	public int channelInt;
	public int volume;
	
	//생성자 생략
	
	//void 외에 모든 타입의 메소드는 반드시 꼭 return 값을 갖는다
	
	public int channelUp(int volume) {
		this.volume=volume;
		System.out.println("소리를 높이겠습니다.");
		return volume+2;//반환 값
		
	}
	
	public void channeldown(int volume) {
		this.volume=volume;
		System.out.println("소리를" +volume+"만큼 낮추겠습니다.");
		//return volume+2;//void는 반환 값을 넣으면 안된다
		
	}
	
	public static void main(String[] args) {
		
		FunTest06 tv=new FunTest06();
		//tv.channelUp(9);
		//방법1
		System.out.println("소리를 "+tv.channelUp(9)+"만큼 올리겠습니다");
		
		//방법2
		int volume = tv.channelUp(9);
		System.out.println("소리를 "+volume+"만큼 올리겠습니다");
		
		//void 
		tv.channeldown(3);
	}

}
