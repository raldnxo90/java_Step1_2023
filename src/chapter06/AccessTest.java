package chapter06;

public class AccessTest {
	
	//필드
	private int aa;
	public int bb;
	int cc;

	//디폴트 생성자
	
	//메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void Diosp() {
		System.out.println("aa값 : "+aa+"\nbb값 : "+bb+"\ncc값 : " +cc);
		
	}
	
	public static void main(String[] args) {
		//객체(obj)
		AccessTest obj = new AccessTest();
		
		obj.setAa(33);
		//obj.aa = 33;
		obj.setBb(4);
		obj.setCc(5);
		obj.Diosp();
		 

	}//메인


}//클래스
