package chapter02;

public class Arith_Test {

	public static void main(String[] args) {
		// 총점과 평균을 출력
		
	int mathScore=96;
	int engScore=87;
	
	System.out.println("총 점 : "+(mathScore+engScore)); // 총점 
	System.out.println("평 균 : "+((mathScore+engScore)/2)); // 평균
	System.out.println("===============");
	
	int total = mathScore + engScore;
	System.out.println("총 점: "+total);
	
	double avgerage = total/2;
	System.out.println("평 균: "+avgerage);
	

	}

}
