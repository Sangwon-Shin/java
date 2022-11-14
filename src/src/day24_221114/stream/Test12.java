// 현재 이 파일이 에러나는 이유: Member 클래스를 바꿔놨기 때문.
package day24_221114.stream;
import java.io.*;
public class Test12 {
/*
 	jennie.jny 파일을 읽어보자.
 */
	public Test12() {
		// 기본 스트림 준비
		FileInputStream fin = null;
		// 보조 스트림 준비
		ObjectInputStream oin = null;
		try {
			fin = new FileInputStream("src/day24_221114/stream/jennie.jny");
			oin = new ObjectInputStream(fin);
			
			// 데이터 읽어서 변수에 기억
			Member memb = (Member) oin.readObject();
			
			// 출력
			System.out.println("이름: " + memb.getName());
			System.out.println("메일: " + memb.getMail());
			System.out.println("나이: " + memb.getAge());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}
