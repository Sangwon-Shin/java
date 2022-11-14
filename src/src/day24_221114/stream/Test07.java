package day24_221114.stream;
import java.io.*;
public class Test07 {
	// 파일에 저장하는 프로그램을 BufferedStream 을 이용해서 만드세요

	public Test07() {
		// 1. 기본(타겟) 스트림 준비. 보조스트림만으로 처리하는 경우는 없다.
		FileOutputStream fout = null;
		// 2. 보조 스트림 준비. 
		BufferedOutputStream bout = null;
		try {
			fout = new FileOutputStream("src/day24_221114/stream/제니정보.txt");
			bout = new BufferedOutputStream(fout); // 보조스트림은 기본스트림에 연결해서 만드니깐...
			// 나중에 닫을 때 fout 부터 닫으면 bout 이 이상해진다. 그러므로 bout 부터 닫는다. 
			String str = "이름: 제니, 전화번호: 010-1111-2222";
			byte[] buff = str.getBytes();
			// 보조스트림에 흘려준다.
			bout.write(buff);
			/*
			 	버퍼는 채워져야 기본스트림으로 데이터가 빠져나간다.
			 	아직 버퍼가 채워지지 않았으므로 데이터가 기본스트림으로 흘러가지 않은 상태이다.
			 	따라서 버퍼를 강제로 비워줘야 한다.
			 */
			bout.flush();
			System.out.println("========저장 성공========");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
