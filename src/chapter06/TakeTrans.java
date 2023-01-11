package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		// 학생 2명 생성
		StdInfo studentJames = new StdInfo("James", 12000);
		StdInfo studentTom = new StdInfo("Tom", 10000);

		// 버스타기
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		// 정보확인
		studentJames.showInfo();// 지출
		bus100.showInfo();// 수입증가, 인원 수 증가
		System.out.println("----------------------------------------");
		Bus bus987 = new Bus(987);
		studentTom.takeBus(bus987);
		studentTom.showInfo();
		System.out.println("========================================");

		// 지하철타기
		Subway sub4 = new Subway("4호선");
		studentTom.takeSubway(sub4);
		studentTom.showInfo();// 지출
		sub4.showInfo();
		System.out.println("========================================");
		studentJames.takeSubway(sub4);
		studentJames.showInfo();
		sub4.showInfo();

	}
}