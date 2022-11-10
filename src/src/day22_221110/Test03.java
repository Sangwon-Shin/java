package day22_221110;
import java.util.*;
public class Test03 {

	public Test03() {
		HashSet<String> names = new HashSet<String>();
		names.add("jennie");
		names.add("lisa");
		names.add("rose");
		names.add("jisoo");
		
		// 제너릭스는 전파되지 않는다.
		ArrayList list = new ArrayList(names);
		
		// 여기도 Object 타입으로 데이터를 기억한다.
		Iterator<String> itor = names.iterator();
		
		while(itor.hasNext()) {
			String name = itor.next();
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
