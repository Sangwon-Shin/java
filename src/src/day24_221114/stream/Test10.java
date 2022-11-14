package day24_221114.stream;
import java.io.*;
public class Test10 {
/*
 	휘파람.txt 파일을 바이트 기반 기본스트림과 문자 기반 보조스트림을 이용해서
 	읽어보자.
 */
	public Test10() {
		// 기본 스트림
		FileInputStream fin = null;
		// 바이트기반(기본스트림)과 문자기반(보조스트림)을 연결해줄 보조스트림
		InputStreamReader isr = null;
		// 보조 스트림
		BufferedReader br = null;
		
		try {
			fin = new FileInputStream("src/day24_221114/stream/휘파람.txt");
			isr = new InputStreamReader(fin);
			br = new BufferedReader(isr);
			
			while(true) {
				String line = br.readLine(); // 줄바꿈기호는 읽지 않는다.
				if(line == null) break;
				System.out.println(line); // 그래서 println() 쓴다.
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();	// 세 개 닫는 순서에 주의
				isr.close();
				fin.close();
			} catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test10();
	}

}
