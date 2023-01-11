package chapter03.FOR;

import java.util.Scanner;

public class forTest09_1 {

	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력받아 총점과 평균을 구하시오(단, 평균은 실수로 출력할 것)
		
		Scanner scan=new Scanner(System.in);
		int i, sum=0, cnt=0, score;
		double avg=0;
		
		System.out.print("몇명의 학생 점수를 입력 받으시겠습니까? :");
		int stu=scan.nextInt();
		
		for (i=1; i<=stu; i++) {
			System.out.print(i + "번째 점수를 입력하시오 ");
			score=scan.nextInt();
			sum+=score;
			cnt++;//인원 수 누적
		}
		avg=sum/cnt;
		System.out.println("총점 : "+sum+"평균 : " + (avg=(sum/cnt)));
	}

}
