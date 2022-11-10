package day22_221110;

import java.util.*;

public class Test04 {

	public Test04() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "jennie");
		map.put("age", "27");
		map.put("mail", "jennie@githrd.com");
		
		String name = map.get("name");
		System.out.println("name: " + name);
	}

	public static void main(String[] args) {
		new Test04();
	}

}
