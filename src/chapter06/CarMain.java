package chapter06;

import javax.swing.JOptionPane;

public class CarMain {

	public static void main(String[] args) {

		Car myCar = new Car();

		System.out.println("제작회사 : " + myCar.company + "\n모델명 : " + myCar.model + "\n색상 : " + myCar.color + "\n최고속도 : "
				+ myCar.maxSpeed + "\n현재속도 : " + myCar.Speed);
		System.out.println("---------------------------------");

		// myCar.Speed = 60;
		myCar.Speed = Integer.parseInt(JOptionPane.showInputDialog("변경된 차의 속도"));
		System.out.println("변경된 현재 속도 : " + myCar.Speed);
	}

}
