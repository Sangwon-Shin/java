package day21_221109;
import java.util.*;
public class Test04 {

	public Test04() {
		/*
		TreeMap map = new TreeMap();
		map.put(new Nemo(1, 1), "네모1");	// 에러 not comparable
		map.put(new Nemo(2, 2), "네모2");	// 에러 not comparable
		키는 크기비교 가능한 타입이어야 한다.
		 */
		TreeMap map = new TreeMap(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Nemo n1 = (Nemo) o1;
				Nemo n2 = (Nemo) o2;
				int result = n1.getArea() == n2.getArea() ? 0 :
								n1.getArea() < n2.getArea() ? 1 : -1;
				return result;
			}
			
		});
		Nemo n1 = new Nemo(1, 1);
		Nemo n2 = new Nemo(2, 2);
		map.put(n1, "네모1");	// 에러 not comparable
		map.put(n2, "네모2");	// 에러 not comparable
		System.out.println("n1: " + map.get(n1));
		map.put(new Nemo(3, 3), "네모3");
		map.put(new Nemo(4, 4), "네모4");
		Set set = map.keySet();
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			Object key = itor.next();
			System.out.println("네모: " + map.get(key));
		}
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
