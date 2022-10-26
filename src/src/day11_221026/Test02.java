// 얕은복사의 특징
// heap 영역에 있는 데이터는 프로그램이 종료될 때까지는 살아남는다.
package day11_221026;

public class Test02 {

	public Test02() {
		// 배열 주소를 기억할 변수
		int[] a;
		{
			int[] b;
			b = new int[5];
			b[2] = 100;
			a = b; 
		}
		// b가 선언된 블럭을 벗어났으므로 b는 사라진다. 
		// 그런데 b가 참조하는 인스턴스의 주소를 a가 기억하고 있으므로
		// 그 값을 불러올 수 있다.
		System.out.println("a[2]: " + a[2]);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
