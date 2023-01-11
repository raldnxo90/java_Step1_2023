package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		//메서드를 통해 팀명을 초기화
		TeamGroup team = new TeamGroup();
		TeamMember t = new TeamMember();
		
		t.setTeamName("한라봉");
		System.out.println("팀명 : "+t.getTeamName());
		System.out.println("-------[팀원 명단]-------");
		//메서드를 통해 팀명을 초기화
		team.init();
		team.Disp();
		
		t.setmName("김창우");
		t.setmPhone("010");
		t.setsName("백우기");
		System.out.println(t.getTeamName()+"팀의 팀장 : "+t.getmName()+"("+t.getmPhone()+")\n"+ t.getTeamName()+"팀의 부팀장 : "+t.getsName());
	}

}
