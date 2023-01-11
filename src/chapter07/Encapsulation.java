package chapter07;

public class Encapsulation {

	private int Side;
	private int Height;

	//생성자의 목적 - 초기화
	public Encapsulation() {
		Side = 0;
		Height = 0;

	}

	public int Cal_Area(int S, int H) {
		Side = S;
		Height = H;

		return (S * H);
	}
}//class
