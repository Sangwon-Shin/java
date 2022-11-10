package day22_221110;
import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Test02 {
/*
	Properties 에 데이터를 입력해서 파일로 저장해보자. 
 */
	public Test02() {
		// Properties 준비
		Properties prop = new Properties();
		// Map 처럼 데이터를 추가한다. 단, 문자열로 추가한다.
		prop.put("name", "wooyoung");
		prop.put("age", "32");
		prop.put("mail", "wooyoung@githrd.com");
		prop.put("addr", "서울시 영등포구 신길동");
		
		System.out.println("addr: " + prop.get("addr"));
		// 파일로 저장
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day22_221110/wooyoung.smart");
			// prop 에 기억된 내용을 파일로 내보낸다.
			prop.store(fout, "주석에 사용할 문자열 데이터");
			// 위 함수가 무사히 실행되면 파일이 저장된 것.
			JOptionPane.showMessageDialog(null, "우영씨 해킹 완료");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
