package day16_221102;
import day10_221025.*;
public class Test05 {

	public Test05() {
		//int no = ((Integer)abc(10)).intValue() + ((Integer)abc(20)).intValue();
		int no = (int)abc(10) + (int)abc(20);
		System.out.print(no);
		
		Semo s = new Semo();
		((Semo)xyz(s)).width = 20;	// xyz 의 반환값은 Figure 타입이고, 
		// Figure 타입은 width 를 멤버로 갖지 않으므로 강제형변환해서
		// width 변수가 있는 Semo 타입으로 바꿔야 한다.
		
	}
	public Object abc(int a) {
		return a;
	}
	public Figure xyz(Figure f) {
		return f;
	}
	public static void main(String[] args) {
		new Test05();
	}

}
