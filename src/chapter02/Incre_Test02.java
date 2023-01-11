package chapter02;

public class Incre_Test02 {

	public static void main(String[] args) {
		
		int x=10;
		int y=10;
		int z;
		
		System.out.println("============");
		x++; //10 -> 11
		++x; //12
		System.out.println("x = : " + x);
		
		System.out.println("============");
		y--; // 10 -> 9
		--y; // 8
		System.out.println("y = : " + y);
		
		System.out.println("============");
		z=x++; //z=12, x=13 
		System.out.println("z = : " + z);
		System.out.println("x = : " + x);
		
		System.out.println("============");
		z=++x; //z=14, x=14 
		System.out.println("z = : " + z);
		System.out.println("x = : " + x);
		
		System.out.println("============");
		z=++x + y++; //x=15, y=9, z=23(15+8) 
		System.out.println("z = : " + z);
		System.out.println("x = : " + x);
		System.out.println("y = : " + y);
		
	}
	
	//> . < , >= , <= , == , !
	
}
