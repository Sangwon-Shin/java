package day24_221114;
// Nemo.java 파일의 내용을 읽어보자.
import java.io.*;
import java.util.*;
public class Test04 {

	public Test04() {
		File file = new File("src/day24_221114/Nemo.java");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(true) {
				String str = sc.nextLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
		} catch(Exception e) {
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
