package day22_221110;
import java.io.*;
import java.util.*;
public class Test01 {
/*
 * test.properties 파일을 읽어서 Map 에 기억시키고 출력해보자
 */
	public Test01() {
		// Properties 객체 만들기
		Properties prop = new Properties();
		// 외부 파일과 연결한다.
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day22_221110/test_ko.properties");
			
			// 파일에서 읽은 내용을 Properties 가 읽도록 하자.
			prop.load(fin); 	// 파일의 내용이 Map 으로 바뀜
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {	// IOException
				e.printStackTrace();
			}
		}
		// 이제 HashMap 처럼 사용하면 된다.
		String name = (String) prop.get("name");
		String mail = (String) prop.get("mail");
		String tel = (String) prop.get("tel");
		String sage = (String) prop.get("age");
		int age = Integer.parseInt(sage);
		
		// 출력
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("mail: " + mail);
		System.out.println("tel: " + tel);
	}

	public static void main(String[] args) {
		new Test01();
	}

}
