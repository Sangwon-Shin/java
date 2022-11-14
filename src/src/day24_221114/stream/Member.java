package day24_221114.stream;

import java.io.Serializable;

public class Member implements Serializable {	
	// ↑ 직렬화 가능한 클래스는 Serializable 인터페이스를 구현한 클래스
	private int age;
	//private String name, mail;
	private String name, mail, tel;	// Test12 만들고 나서 클래스 변경하면 에러
	// 직렬화 할 때는 양쪽에 모두 같은 클래스가 있어야 한다.
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}
