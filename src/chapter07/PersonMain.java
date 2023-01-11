package chapter07;

public class PersonMain {

	public static void main(String[] args) {
		
		Person human = new Person();
		System.out.println(human.name = "김유신");
		System.out.println(human.height = 180f);
		System.out.println(human.weight = 80f);
		
		System.out.println("----------------");
		Person human2 = new Person("강감찬");
		System.out.println(human2.name);
		System.out.println(human2.height = 180f);
		System.out.println(human2.weight = 80f);
		
		System.out.println("----------------");
		
		Person human3 = new Person("이순신",170,70);
		System.out.println(human3.name);
		System.out.println(human3.height);
		System.out.println(human3.weight);
	}
	
}


