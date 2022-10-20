// 자바에서 모든 클래스는 Object 클래스를 상속한다.
// 그러나 이렇게 쓰면 안된다.

package day07_221020;

import java.util.Arrays;

public class Test06 {

	public static void main(String[] args) {
		Object[] obj = new Object[3];
		
		obj[0] = "jennie";
		obj[1] = 27;
		obj[2] = 'F';
		
		obj[1] = (int)obj[1] + 1;	// 해가 바뀌어서 나이를 +1 하려면 강제형변환을 해야한다.
		// 저장 : int ---> Integer ---> Object
		// 위의 연산 : Object ---> Integer ---> int
		System.out.println(Arrays.toString(obj));
	}

}
