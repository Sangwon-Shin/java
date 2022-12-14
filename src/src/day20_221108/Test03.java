package day20_221108;
import java.util.*;
public class Test03 {

	public Test03() {
		TreeSet set = new TreeSet();
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("disc");
		set.add("dance");
		set.add("elephant");
		set.add("elevator");
		set.add("superman");
		set.add("flower");
		set.add("spiderman");
		
		/*
		 	 이 중에서 b로 시작하는 데이터부터 d로 시작하는 데이터까지만 꺼내서
		 	 새로 Set 을 만든다.
		 */
		ArrayList<String> list = new ArrayList<String>(set);
		for(String s : list) {
			System.out.println(s + ", ");
		}
		System.out.println();
		
		TreeSet tmpSet = (TreeSet) set.subSet("b", "e");
		list = new ArrayList<String>(tmpSet);
		for(String s : list) {
			System.out.println(s + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test03();
	}

}
