package day24_221114.stream;
import java.io.*;
import java.util.Arrays;
public class Test02 {
/*
	Test01.java 파일을 읽어보자.
 */
	public Test02() {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day24_221114/stream/Test01.java"); // byte 단위 기본스트림
			// 1. 한 글자 읽기
			/*
			int ch = fin.read();
			System.out.println((char) ch);
			*/
			
			// 2. 여러 글자 읽기
			/*
			byte[] buff = new byte[1024]; // 전체 읽기에 부족한 길이
			int len = fin.read(buff);	// 읽은 데이터를 buff 라는 바이트 배열에 기억하고 읽은 개수 반환
			String str = new String(buff, 0, len);
			System.out.println(str);
			*/
			
			// 3. 파일 전체 읽기
			byte[] buff = new byte[1024];
			while(true) {
				// 배열 초기화
				Arrays.fill(buff, (byte) 0);
				// 읽고
				int len = fin.read(buff);
				// 문자열로 변환
				String str = new String(buff, 0, len);
				System.out.print(str);
			}
		} catch(Exception e) {}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
