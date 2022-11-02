package day16_221102;

public class Test02 {

	public Test02() {
		Son s = new Son();
		
		Grand g = s;
		g.abc();
		Father f = s;
		f.abc();
		f.xyz();
		System.out.println(f.money);
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
