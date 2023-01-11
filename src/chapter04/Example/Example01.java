package chapter04.Example;

public class Example01 {

	public static void main(String[] args) {

		// for문을 이용하여 다음 배열의 점수를 줄 단위로 평균을 구하시오

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0;
		int total = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				count++;
				sum += array[i][j];
				avg = sum / array[i].length;
			} // 내부for문

			total += sum;

			System.out.println(i + "행 단위 점수의 합 : " + sum);
			System.out.println(i + "행 단위 점수의 평균 : " + avg);
			System.out.println("----------------------------");
			sum = 0;

		} // 외부for문
		System.out.println("전체 점수의 합 : " + total);
		System.out.println("전체 점수의 평균 : " + (double) total / count);

	}// 메인

}// 클래스