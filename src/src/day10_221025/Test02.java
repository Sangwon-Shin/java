package day10_221025;

public class Test02 {

	public static void main(String[] args) {
		getJennie();	// 이 함수를 static 으로 선언하면 호출할 수 있다. 
		// 그러나 static을 하면 항상 static memory 를 점유한다는 점과
		// 보안에도 좋지 않다는 점 때문에 static 으로 선언하는것은 조심해야한다.
	}
	
	public static void getJennie() {
		for(int i = 0; i < 3; i++) {
			System.out.println("jennie");
		}
	}
}
