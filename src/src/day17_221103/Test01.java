package day17_221103;

public class Test01 {

	public Test01() {

	}

	public static void main(String[] args) {
		new Test01();
	}

}

final class Father01 {
	public int no;
	public final int num = 100;
	// final 변수는 생성되는 순간 초기화 되어야 한다.

	public void abc() {
		System.out.println("Father01.abc()");
	}

	public final void xyz() {
		System.out.println("Father01.xyz()");
	}
}

class Son01 {
	public void abc() {
		System.out.println("Son01.abc()");
	}

	public final void xyz() {
		System.out.println("Son01.xyz()");
	}
}

class GrandSon01 extends Son01 {
	// @override
	public void abc() {
		System.out.println("GrandSon01.abc()");
	}

	/*
	 * public final void xyz() { System.out.println("GrandSon01.xyz()"); final 함수는
	 * 오버라이드 불가능
	 */
}
