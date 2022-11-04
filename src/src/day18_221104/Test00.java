package day18_221104;

public class Test00 {

	public Test00() {
		for(int i = 0; i < 10 - i; i++) {
			System.out.println(i); // 4까지만 출력된다.
			// → for 문의 계속조건은 매 루프마다 조건을 확인한다.
			// → 계속조건에 token.countTokens() 를 넣으면 안된다.
		}
	}

	public static void main(String[] args) {
		new Test00();
	}

}
