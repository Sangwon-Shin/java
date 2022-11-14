package day24_221114.stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import javax.swing.JOptionPane;
public class Test04 {
/*
 	whistle.txt 파일을 휘파람.txt 로 복사해보자.
 */
	public Test04() {
		/*
		  	파일 복사는 우선 파일을 읽어와서 읽은 내용을 내보내면 된다.
		  	따라서 스트림도 두 가지 방향이 모두 필요하다.
		 */
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream("src/day24_221114/stream/whistle.txt");
			fout = new FileOutputStream("src/day24_221114/stream/휘파람.txt");
			// 몇 번 반복해야할 지 모르니까
			byte[] buff = new byte[1024];
			while(true) {
				Arrays.fill(buff, (byte) 0);
				// 먼저 읽고 
				int len = fin.read(buff);
				/*
				 	read(byte[] b) 함수는 읽은 데이터가 없는 경우 -1 반환
				 	따라서 이때는 쓰는 while 문을 멈춰야한다.
				 */
				if(len == -1) break;
				fout.write(buff, 0, len);
			}
			JOptionPane.showMessageDialog(null, "*** 파일 저장 성공 ***");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "### 파일 저장 실패 ###");
		} finally {
			try {
				fout.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
