package day18_221104;
import java.util.*;
public class Test03 {

	public Test03() {
		ArrayList list = new ArrayList();
		list.add("jennie");
		list.add("lisa");
		list.add("rose");
		list.add("jisoo");
		System.out.println(list);
		list.set(2, "ROSE");
		list.add("rose");
		list.add("rose");
		System.out.println(list);
		
		Vector vec = new Vector(list);
		System.out.println(vec);
		
		Enumeration en = vec.elements();
		System.out.println("+++++++++++++++++++++");
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement() + ", ");
		}
		System.out.println();
		
		HashSet set = new HashSet(list);
		set.add("rose");
		// ↑해시코드를 기준으로 정렬해서 데이터 기억
		// set 은 get 함수가 없다. 데이터를 꺼내지 못한다. 출력만 가능
		System.out.println(set);
		// set의 데이터를 꺼내려면 다른 컬렉션 타입으로 형변환 해야한다.
		System.out.println("+++++++++++++++++++++");
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
