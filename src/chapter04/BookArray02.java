package chapter04;

public class BookArray02 {

	public static void main(String[] args) {
		//Book(); 5번 호출
		Book[] library=new Book[5];//library 인스턴스변수
		
		library[0]=new Book("데미안","헤르만 해세");//실매개변수
		library[1]=new Book("우하하하하","김우태");//실매개변수
		library[2]=new Book("흐헤헤헤헤","조두현");//실매개변수
		library[3]=new Book("케케케케케","엄상현");//실매개변수
		library[4]=new Book("타타타타타","돌은자");//실매개변수
		/*
		library[0].showBookinfo();
		library[1].showBookinfo();
		library[2].showBookinfo();
		library[3].showBookinfo();
		library[4].showBookinfo();
		*/
		
		for(int i=0;i<library.length;i++) {
			library[i].showBookinfo();
			System.out.println();
		}
		
	}

}
