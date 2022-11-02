package day16_221102;
import java.util.*;		// collection
import day10_221025.*;
public class Test04 {

	public Test04() {
		ArrayList list = new ArrayList();	// ArrayList 요소는 Object 타입 
		list.add(1);	// int -(Boxing)-> Integer -(자동형변환)-> Object
		list.add("jennie");
		list.add('F');	// char -(Boxing)-> Character -(자동형변환)-> Object
		list.add(new Figure());
		
		// list.get(3).toPrint(); list 에는 Object 타입으로 저장되므로 toPrint 못씀.
		((Figure)list.get(3)).toPrint();
		System.out.println("list.get(0) + 3 : " + ((Integer)list.get(0) + 3));
		// Object 에서 int 로 바로 바꾸지 못한다. Integer로 먼저 바꾼 후
		// Unboxing 해야 한다.
		
		//ArrayList<int> list1 = new ArrayList<int>();	// <> 안에는 클래스만 가능
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		System.out.println(list1.get(0) + 100);
	}

	public static void main(String[] args) {
		new Test04();
	}

}
