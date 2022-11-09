package day21_221109;
import java.util.*;
public class Test03 {

	public Test03() {
		HashMap map = new HashMap();
		/*
		map.put("jennie", "제니");
		map.put("lisa", "리사");
		map.put("rose", "로제");
		map.put("jisoo", "지수");
		
		// 데이터 꺼내기
		String name = (String) map.get("jennie");
		System.out.println("jennie: " + name);
		*/
		
		// 제니의 정보를 기억하는 맵을 만드세요
		map.put("name", "jennie");
		map.put("age", 27);
		map.put("height", 163.3);
		map.put("gen", 'F');
		
		System.out.println("name: " + map.get("name"));
		// Object 클래스의 toString 메소드가 오버라이드되어서 map.get("name")
		// 에 적용되어 String 으로 출력된다.
		System.out.println("age: " + map.get("age"));
		System.out.println("height: " + map.get("height"));
		System.out.println("gen: " + map.get("gen"));
	}

	public static void main(String[] args) {
		new Test03();
	}

}
