package day23_221111;

import java.io.FileNotFoundException;

public class Test02 {

	public Test02() {
		//abc(); 예외처리 하지 않으면 에러
		try {
			abc();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		// 예외의 범위를 좁은 것부터 나열해야 한다. 
	}

	public void abc() throws FileNotFoundException {
		// 강제로 예외를 던져보자.
		throw new FileNotFoundException();
		// System.out.println("abc 함수 종료"); 에러 발생. 위에서 예외 발생했으므로
	}
	public static void main(String[] args) {
		new Test02();
	}

}
