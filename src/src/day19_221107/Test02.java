package day19_221107;
import java.util.*;
public class Test02 {

	public Test02() {
		LinkedList list = new LinkedList();
		list.add("jennie");
		list.add("lisa");
		list.add("rose");
		list.add("jisoo");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " | ");
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
