package day21_221109;
import java.util.*;
public class Test01 {
	public int no = 100;
	public Test01() {
		//Comparator comp = new Comparator(); Comparator 는 인터페이스라서 new 불가.
		 T01 t1 = new T01();
	}

	public static void main(String[] args) {
		new Test01();
	}
	public void abc() {}
	public class T01 {
		// 전역내부클래스
		int num = no;
		public void xyz() {
			abc();
		}
		//abc(); //클래스 바로아래 블럭에서 일반 함수 사용불가
		{abc();}	// 인위적 블럭을 만들어서 함수 실행 가능. 초기화블럭과 같은 맥락
	}
	public static class TopClass {
		// Top Level 내부클래스
	}
}

class ExtnClass {
	// 이 클래스는 외부 클래스(같은 파일 안에 있다고 내부 클래스가 아니다)
	Test01 t0 = new Test01();
	int no = t0.no;
	
	public void a1() {
		Test01.T01 t1 = t0.new T01();
		t1.xyz();
		t0.new T01().xyz();
	}
}
