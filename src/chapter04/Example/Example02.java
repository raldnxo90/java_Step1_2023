package chapter04.Example;

public class Example02 {

	public static void main(String[] args) {
		// 회원가입은 0번부터 회원번호가 부여된다
		// 현재 부여된 다음의 번호 중 가장 큰 회원번호를 출력하시오

		int max = 0;
		int array[] = { 1, 6, 9, 2, 35, 178, 234, 4, 5, 11 };
		
		
		// 최대값 알고리즘

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}

		} // for문
		System.out.println("배열의 가장 큰 값은 : " + max);
		
		/*
		for(int i=1;i<array.length;i++) {
			for(int j=0;j<i;j++) {
				if(array[j]>array[i]) {
					int a;
					a=array[i];
					array[j]=array[i];
					array[i]=a;
					
				}
				System.out.print(array[i]+" ");	
			}
		} */
		
	}// 메인

}// 클래스
