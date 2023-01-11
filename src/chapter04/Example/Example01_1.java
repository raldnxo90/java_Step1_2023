package chapter04.Example;

public class Example01_1 {

	public static void main(String[] args) {

		// for문을 이용하여 다음 배열의 점수를 줄 단위로 평균을 구하시오

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum[] = new int[3];
		double avg = 0;
		int total = 0;
		int count = 0;
		
		/*
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				sum[i] += array[i][j];
				count++;
				
			} // 내부for문

			System.out.println(i + "행 단위 점수의 합 : " + sum[i]);
			avg=sum[i]/(double)count;
			System.out.println(i + "행 단위 점수의 평균 : " + avg);
			System.out.println("----------------------------");
			
		} // 외부for문
	
	//방법2
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
				
			total += array[i][j];
			count++;
		}
	}
	avg=total/(double[i].Length);
	*/
		
	//방법3
	for(int[] num :array) {//95, 86 //
		for(int score : num) {//95 //86
			total+=score;
			
		}//in for
		count++;
		System.out.println(count + "번째 학생의 합계 : "+total);
		total=0;//초기화
	}//out for
	
}// 메인
}// 클래스