package day24_221114.stream;
import java.io.*;
public class Test11 {
/*
 	Member 클래스에 친구의 정보를 기록해서 파일에 저장해보자.
 	ObjectOutputStream 을 이용해서 저장.
 */
	public Test11() {
		// 데이터 만들고
		Member jennie = new Member();
		jennie.setName("제니");
		jennie.setMail("jennie@githrd.com");	
		jennie.setAge(27);
		
		// 스트림 준비
		FileOutputStream fout = null;
		// 보조 스트림 준비
		ObjectOutputStream oout = null;
		try {
			fout = new FileOutputStream("src/day24_221114/stream/jennie.jny");
			oout = new ObjectOutputStream(fout);
			
			// 데이터 흘려보내고
			oout.writeObject(jennie);
			// 이처럼 클래스 전체를 입출력하는 것을 직렬화라고 한다.
			System.out.println("**** 저장완료 *****"); // 글자 깨짐.
			// ObjectOutputStream 으로 내보낸 스트림은 ObjectInputStream 으로 읽어야 한다.
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
