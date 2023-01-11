package chapter03.FOR;

import java.util.Scanner;

public class forTest09 {

	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력받아 총점과 평균을 구하시오(단, 평균은 실수로 출력할 것)
		
		Scanner scan=new Scanner(System.in);
		int i, sum=0, cnt=0, sco;
		double avg=0;
		
		System.out.print("몇명의 학생 점수를 입력 받으시겠습니까? :");
		int stu=scan.nextInt();
		
		for (i=1; i<=stu; i++) {
			System.out.print("점수를 입력하시오 ");
			sco=scan.nextInt();
			sum+=sum;
		}
		System.out.println("학생 들의 평균 정수는 " + (avg=(stu/sum)));
	}

}
