package chapter06;

import java.util.Scanner;

public class TeamGroup {

	// 멤버변수 (배열 - > 팀구성원)
	private TeamMember member[] = new TeamMember[6];
	Scanner scan = new Scanner(System.in);

	// 기본생성자

	// 초기화 메소드
	public void init() {
		member[0] = new TeamMember("김창우", "남성");
		member[1] = new TeamMember("백우기", "남성");
		member[2] = new TeamMember("정세나", "여성");
		member[3] = new TeamMember("박수연", "여성");
		member[4] = new TeamMember("박범근", "남성");
		member[5] = new TeamMember("김우태", "남성");
	}

	// 출력 메소드
	public void Disp() {

		for (int i = 0; i < member.length; i++) {
			System.out.print("성명 : "+member[i].getName());
			System.out.println(" | 성별 : "+member[i].getGender());
		}
	}

}
