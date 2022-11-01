package day15_221101;

public class Member {
	private String name, birth;
	private String gName = "woojoo";	// 1. 명시적 초기화
	private String[] arr;	// 멤버의 이름들을 기억하는 배열
	public Member() {
		gName = "blackpink";	// 4. 생성자를 이용한 초기화
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String[] getArr() {
		return arr;
	}
	public void setArr(Test04 t) {
		arr = new String[t.cnt];
	}
}
