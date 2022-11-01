/*
 		Member 클래스를 사용하기 위해서는
 		1. 먼저 객체로 만들어준다.
 		2. 멤버들에 필요한 작업들을 해준다.
 		3. 주소를 이용해서 멤버에 접근해서 필요한 작업을 하면 된다.
 */


package day15_221101;

public class Test05 {

	public Test05() {
		Member m1 = new Member();
		m1.setName("jennie");
		System.out.println("m1.gName: " + m1.getgName());
		System.out.println("m1.Name: " + m1.getName());
	}

	public static void main(String[] args) {
		new Test05();
	}

}
