package chapter03.IF.SWITCH;

public class Switchase06 {

	public static void main(String[] args) {
		// 오전 9 ~ 오후 6
		int time = (int) (Math.random() * 10) + 9;
		System.out.println("[현재시간 : " + time + "시]");
		System.out.print("할 일 : ");

		switch (time) {
		case 9:
		case 10:
		case 11:
		case 12:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
			System.out.println("수업듣기");
			break;
		case 13:
			System.out.println("점심먹기");
			break;

		default:
			System.out.println("복습하기");
			break;
		}

	}

}
