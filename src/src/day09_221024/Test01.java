package day09_221024;
/*
public class Test01 {
	int no = 5;	// static으로 선언하지 않으면 main 함수 안에서 쓸 수 없다. static 안쓰려면? 
	// static 멤버가 아니면 main 안에서 사용할 수 없다는 것은 반만 맞는 말이다.
	public static void main(String[] args) {
		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		t1.no = 10;
		t2.no = 100;
		
		System.out.println("t1.no: "+t1.no);
		System.out.println("t2.no: "+t2.no);
	}

}
*/

public class Test01 {
	int no = 5; // static으로 선언하지 않으면 main 함수 안에서 쓸 수 없다. static 안쓰려면?

	public Test01() {
		// 생성자는 클래스 이름과 동일한 이름을 가져야 한다.
		// 생성자는 반환값타입이 존재하면 안된다. void를 주기만 해도 생성자가 아니게된다.
		// 반환값을 가지게 되는 순간 생성자가 아닌 일반함수가 된다.
		// 이곳에서는 static 멤버, 일반멤버 모두 사용가능
		// 앞으로는 이곳에 필요한 코딩을 할 예정이다.
	}

	public static void main(String[] args) {
		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		t2.no = 100;
		
		System.out.println("t1.no: " + t1.no);	// main 함수 밖에서 초기화한 변수 사용 가능.
		System.out.println("t2.no: " + t2.no);
	}

}
