package day16_221102;

public class Test01 {

	public Test01() {
		Grand g = new Grand();
		Father f = new Father();
		Son s = new Son();
		System.out.println("Grand Class");
		g.abc();
		System.out.println("\nFather Class");
		f.abc();
		f.xyz();
		System.out.println("father money: " + f.money);
		System.out.println("\nSon Class");
		s.abc();
		s.xyz();
		s.toPlay();
		System.out.println("Son money: " + s.money);
		System.out.println();
		Grand g2 = f;
		Grand g3 = s;
		Father f2 = s;
		
		
		g2.abc();	// Grand에도 abc가 있으므로 Father 타입의 abc가 오버라이드된 결과 실행.
		// g3.toPlay();	에러. g3의 명목적 타입은 Grand 이기 때문에 toPlay 함수 오버라이딩 불가
		((Son)g3).toPlay();
		Grand[] gArr = new Grand[3];
		gArr[0] = g;
		gArr[1] = f;
		gArr[2] = s;
		System.out.println();
		for(Grand h : gArr) {
			h.abc();
		}
		// System.out.println(gArr[1].money);	에러 발생. 변수는 Grand의 것을 참조
		// System.out.println(gArr[2].money);	에러 발생. 변수는 Grand의 것을 참조
		// 함수는 인스턴스, 변수는 타입에 따른다.
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
