package day18_221104;

import java.util.*;

public class Test02 {

	public Test02() {
		Vector vec = new Vector();
		int cap = vec.capacity();
		System.out.println(cap); // 10
		for (int i = 0; i < 11; i++) {
			vec.add("jennie");
		}
		cap = vec.capacity();
		System.out.println("vec size: " + vec.size()); // 11
		System.out.println("vec.capacity: " + cap); // 20
		for (int i = 0; i < 11; i++) {
			vec.add("jennie");
		}
		cap = vec.capacity();
		System.out.println("vec size: " + vec.size()); // 22
		System.out.println("vec.capacity: " + cap); // 40
		
		ArrayList list = new ArrayList(vec);	// ArrayList 로 복제
		System.out.print(vec);
	}
	public Test02(int p) {
		Vector vec = new Vector(10, 10); //****
		int cap = vec.capacity();
		System.out.println(cap); // 10
		for (int i = 0; i < 11; i++) {
			vec.add("jennie");
		}
		cap = vec.capacity();
		System.out.println("vec size: " + vec.size()); // 11
		System.out.println("vec.capacity: " + cap); // 20
		for (int i = 0; i < 11; i++) {
			vec.add("jennie");
		}
		cap = vec.capacity();
		System.out.println("vec size: " + vec.size()); // 22
		System.out.println("vec.capacity: " + cap); // 30
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
