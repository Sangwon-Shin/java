package day07_221020;

import java.util.Arrays;

public class Test06 {

	public static void main(String[] args) {
		Object[] obj = new Object[3];
		
		obj[0] = "jennie";
		obj[1] = 27;
		obj[2] = 'F';
		
		obj[1] = (int)obj[1] + 1;
		// 저장 : int ---> Integer ---> Object
		// 위의 연산 : Object ---> Integer ---> int
		System.out.println(Arrays.toString(obj));
	}

}
