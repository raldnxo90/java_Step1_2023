package chapter03.Example;

public class Example_for01 {

	public static void main(String[] args) {
		// 1~100가지의 수 중 3의 배수의 합
		int i, sum = 0;

		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum+=i;
			}
		}
		System.out.println("3의 배수의 합 : " + sum);
		
	}

}
