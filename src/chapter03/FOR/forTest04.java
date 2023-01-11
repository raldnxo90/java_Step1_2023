package chapter03.FOR;

public class forTest04 {

	public static void main(String[] args) {
		// 0 ~ 100까지의 수 중 홀수만 합하기

		int num;
		int total = 0;

		for (num = 0; num <= 100; num++) {
			if (num % 2 == 0)
				continue;// 그냥 가세요~(무시하라)
			total += num;
		}

		System.out.println("0~100까지의 수중 홀수값의 합 : " + total);

		System.out.println("===============================");
		System.out.println();
		System.out.println("1~20까지의 수중 홀수값만 출력하시요");

		int num2;
		int total2 = 0;

		for (num2 = 0; num2 <= 20; num2++) {
			if (num2 % 2 == 1) {
				System.out.print(num2 + " ");
			}

		}
	}
}