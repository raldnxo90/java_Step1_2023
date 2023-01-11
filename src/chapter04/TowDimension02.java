package chapter04;

import javax.swing.JOptionPane;

public class TowDimension02 {

	public static void main(String[] args) {

		int JavaScore[][] = new int[2][3];

		// for문으로 점수를 입력 받아 채워 넣기

		for (int i = 0; i < JavaScore.length; i++) {
			// 입력
			for (int j = 0; j < JavaScore[0].length; j++) {
				int jumsu = Integer.parseInt(JOptionPane.showInputDialog("점수"));
				// 입력받은 점수 입력
				JavaScore[i][j] = jumsu;
				System.out.println("JavaScore[" + i + "][" + j + "] :" + JavaScore[i][j]);

			} // 열 for문
			System.out.println();
		} // 행 for문

	}

}
