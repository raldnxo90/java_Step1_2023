package chapter07;

public class CarMain {

	public static void main(String[] args) {
		//생성자를 통해 초기화
		Car myCar = new Car("회색", 2000);
		System.out.println("내 차의 CC는 "+myCar.cc+"CC이고 색상은 "+myCar.color);
		
		//멤버변수에 직접 접근해서  출력
		System.out.println("-------------------------------");
		System.out.println("내 차의 CC는 "+myCar.cc+"CC이고 색상은 "+myCar.color);
		
		//메소드를 이용한 출력
		System.out.println("-------------------------------");
		System.out.println("내 차의 CC는 "+myCar.getCc()+"CC이고 색상은 "+myCar.getColor());
		
		
		
		
		

	}

}
