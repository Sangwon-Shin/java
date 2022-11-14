package day24_221114;

public class Test01 {

	public Test01() {
		Nemo n1 = new Nemo(5, 10);
		Nemo n2 = new Nemo(10, 5);
		if(n1.equals(n2)) {
			System.out.println("n1: " + n1);	// Object 클래스의 toString()
			System.out.println("n1 과 n2 는 같은 네모");
			
		}
		else {
			System.out.println("n1 과 n2 는 다른 네모");
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
