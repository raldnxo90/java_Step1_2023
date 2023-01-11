package chapter05;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Method Bread = new Method();
		Method Bread2 = new Method();// 생성자를 호출

		/*
		 * Bread.makeBread(); System.out.println("=============="); Bread.makeBread(5);
		 * System.out.println("=============="); Bread.makeBread(5, "생크림");
		 */

		// Bread.order();
		Bread2.order();
	}

}
