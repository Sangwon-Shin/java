package day05_221018;

import java.util.*;
public class assignmentTest {

	public static void main(String[] args) {
		char ch = 'C';
		char dif = 'z'+'z';
		System.out.println(((Object) (ch+'a'-'A')).getClass().getName());		// int type
		System.out.println(((Object) (dif)).getClass().getName());	// 자바는 리터럴 간의 연산은 타입 변환 없이 해당 타입으로 계산한다.
	}
	

}
