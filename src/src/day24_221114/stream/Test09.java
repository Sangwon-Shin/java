package day24_221114.stream;
/*
 	파일을 문자단위 스트림으로 읽어보자.
 */
import java.io.*;
public class Test09 {

	public Test09() {
		FileReader fr = null; // 아래 try 블럭 지역변수로 만들면 마지막에 닫아줄 수 없다.
		try {
			fr = new FileReader("src/day24_221114/stream/제니정보.txt");
			// 데이터 기억할 배열 준비
			char[] buff = new char[1024];
			int len = fr.read(buff);
			String str = new String(buff, 0, len);
			System.out.println(str);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
