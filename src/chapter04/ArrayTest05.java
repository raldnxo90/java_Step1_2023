package chapter04;

public class ArrayTest05 {

	public static void main(String[] args) {
		
		double data[]=new double[5];
		int size=0;
		
		data[0]=10.0;
		size++;
		data[1]=20.0;
		size++;
		data[2]=30.0;
		size++;
		
		double total=1.0;
		
		for(int i=0;i<size;i++) {
			System.out.println(data[i]);
			total*=data[i];
			
		}//for문
		System.out.println("Total : "+total);

	}

}
