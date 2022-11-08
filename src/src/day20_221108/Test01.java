/*
	 10 명의 이름을 HashSet 에 기억시킨 후 꺼내서 사용해보자.
 */

package day20_221108;
import java.util.*;
public class Test01 {
	String[] woojoo= {"보나", "은서", "다영", "루다", "설아", "여름",
			"엑시", "수빈", "다원", "연정"};
	public Test01() {
		HashSet set = new HashSet();
		for(int i = 0; i < woojoo.length; i++) {
			set.add(woojoo[i]);
		}
		
		// 입력된 개수 출력
		int size = set.size();
		System.out.println("set 에 입력된 개수: " + size);
		
		/*
			Set 계열은 데이터를 꺼내는 기능이 존재하지 않는다.
			Iterator 또는 List 계열로 변환해서 데이터를 꺼내야 한다.
		 */
		
		// 1. Iterator 로 변환시켜서 꺼내는 방법
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			// itor.next() 의 반환값타입은 Object
			String name = (String) itor.next();
			System.out.println(name);
		}
		System.out.println("\n### List 로 출력 ###");
		
		// 2. ArrayList 로 변환시켜서 꺼내는 방법
		ArrayList list = new ArrayList(set);
		for(int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i);
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
