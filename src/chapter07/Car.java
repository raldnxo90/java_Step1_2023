package chapter07;

public class Car {
	
	String color;
	int cc;
	
	public Car() {
	}
	
	public Car(String color, int cc) {
		this.cc = cc;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
}
