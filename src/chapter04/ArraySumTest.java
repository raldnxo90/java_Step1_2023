package chapter04;

public class ArraySumTest {

	public static void main(String[] args) {
		
		int score[]= {98,90,87};
		
		int sum=0;
		
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"]="+score[i]);
			sum+=score[i];
			
		}//for문
		System.out.println("점수의 총합 : "+sum);
		double avg=sum/(double)(score.length);
		//System.out.println("점수의 평균 : "+((double)(sum/i)));
		System.out.println("점수의 평균 : "+Math.round(avg));
	}

}//double avg=sum/(double)(score.length)
//반올림 Math.round