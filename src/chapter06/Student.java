package chapter06;

public class Student {
	
	//필드
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	//디폴트 생성자(free compile) - set으로 초기화, get으로 값을 불러오기
	public Student() {
		
	}//오버로드 생성자가 있을 시, 디폴트 생성자가 필요 시 반드시 명시
	
	
	//생성자 오버로딩 - 초기값을 부여
	public Student(String studentName, String address) {
		this.studentName = studentName;
		this.address = address;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName+", "+address);
	}

}
