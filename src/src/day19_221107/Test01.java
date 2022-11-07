package day19_221107;
import java.util.*;
public class Test01 {

	public Test01() {
		ArrayList list = new ArrayList();
		
		// 데이터 채우기
		list.add("jennie");
		list.add("lisa");
		list.add("rose");
		list.add("jisoo");
		
		System.out.println("list size: " + list.size());
		
		// 데이터 추가
		list.add(1, "Lisa");
		System.out.println("list size: " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print((String) list.get(i) + " | ");
		}
		System.out.println();
		
		// 데이터 수정
		list.set(0, "제니");
		for(int i = 0; i < list.size(); i++) {
			System.out.print((String) list.get(i) + " | ");
		}
		System.out.println();
		
		System.out.println("list contains 'jennie' : " + (list.contains("jennie")? "있음":"없음"));
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
