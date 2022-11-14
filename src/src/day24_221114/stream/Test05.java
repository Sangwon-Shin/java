package day24_221114.stream;
import java.io.*;

import javax.swing.JOptionPane;
public class Test05 {
/*
 	1. 폴더 하나를 강제로 만들어보자.
 	2. 계층화된 폴더 하나를 강제로 만들어보자. 
 	3. 만들어진 폴더 하나를 삭제해보자.
 */
	public Test05() {
		// 1. 폴더 만들기
		/*
		File file = new File("src/day24_221114/stream/test01"); // 폴더에 대한 정보만 저장하고 있는 변수
		file.mkdir();
		*/
		
		// 2. 계층화된 폴더 만들기
		/*
		File file = new File("src/day24_221114/stream/test02/t01/t02");
		if(file.mkdir()) {
			JOptionPane.showMessageDialog(null, "mkdir() 를 이용해서\n폴더 만들기 성공");
		} else {
			JOptionPane.showMessageDialog(null, "mkdir() 를 이용해서\n폴더 만들기 실패");
		}
		*/
		/*
		if(file.mkdirs()) {
			JOptionPane.showMessageDialog(null, "mkdirs() 를 이용해서\n폴더 만들기 성공");
		} else {
			JOptionPane.showMessageDialog(null, "mkdirs() 를 이용해서\n폴더 만들기 실패");
		}
		*/
		// 폴더 삭제
		/*
		File file = new File("src/day24_221114/stream/test02/t01/t02");
		if(file.delete()) {
			JOptionPane.showMessageDialog(null, "delete() 를 이용해서\n폴더 삭제 성공");
		} else {
			JOptionPane.showMessageDialog(null, "delete() 를 이용해서\n폴더 삭제 실패");
		}
		*/
		
		// 폴더 이름 변경
		// 1. 현재폴더와 변경될 폴더를 File 로 만들어둔다.
		File oldF = new File("src/day24_221114/stream/test02/t01");
		File newF = new File("src/day24_221114/stream/test02/T01");
		// 2. 바꾼다
		oldF.renameTo(newF);
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
