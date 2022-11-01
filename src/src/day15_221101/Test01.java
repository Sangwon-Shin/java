package day15_221101;

public class Test01 {
	String name;
	public Test01() {
		Student stud = new Student();
		stud.setName("jennie");	// stud 가 기억하는 주소의 인스턴스 내의 setName
		setName("jennie");	// (1) this. 이 생략된 것.
	}
	public void setName(String name) {	// (1)
		this.name = name;
		System.out.println("이름: " + name);
	}
	public static void main(String[] args) {
		new Test01();
	}

}
