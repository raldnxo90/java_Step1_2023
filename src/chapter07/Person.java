package chapter07;

public class Person { 
	
	String name;
	float height;
	float weight;
	
	//메모리 -전역변수, static / 힙 - 클래스(멤버변수) / 스택 - 메소드(+생성자)
	
	//기본 생성자
	public Person() {}
	
	//오버로딩
	public Person(String name) {
		this.name = name;
		
	}
	public Person(String name, float heigh, float weight) {
		this.name = name;
		this.height = height;	
		this.weight = weight;	
	}

}
