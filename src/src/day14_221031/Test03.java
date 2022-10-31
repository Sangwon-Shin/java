package day14_221031;

public class Test03 {

	public Test03() {
		// 회원 두 명의 데이터를 기억할 객체를 각각 만들어보자.
		Member jennie = new Member();
		Member dooly = new Member();
		
		jennie.setName("jennie");
		jennie.setMail("jennie@githrd.com");
		jennie.setTel("010-1111-1111");
		dooly.setName("dooly");
		dooly.setMail("dooly@githrd.com");
		dooly.setTel("010-2222-2222");
		
		// 각 멤버의 이름 출력
		System.out.println("jennie name: " + jennie.getName());
		System.out.println("dooly name: " + dooly.getName());
	}

	public static void main(String[] args) {
		new Test03();
	}

}
