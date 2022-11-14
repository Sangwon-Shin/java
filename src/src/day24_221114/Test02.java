package day24_221114;
import java.util.regex.*;

import javax.swing.JOptionPane;
/*
	전화번호를 입력받아서 
	형식이 맞는지 검사하세요
 */
public class Test02 {

	public Test02() {
		String tel = JOptionPane.showInputDialog("전화번호를 입력하세요");
		// 1. 패턴 만들기. Pattern 클래스는 생성자가 감춰진 경우이므로
		// 소속 함수 중 반환값이 자기자신이고 속성이 static 인 함수를 사용한다.
		Pattern form = Pattern.compile("0[0-9]{1,2}-[0-9]{3,4}-[0-9]{4}");
		// 2. 정규식 문법 검사
		// Matcher 클래스의 matcher() 메소드
		Matcher mat = form.matcher(tel);
		/*
			Matcher 클래스 안에 검사한 결과가 기억되어있다.
			검사 결과 중 맞는지 틀린지를 알려주는 메소드: matches()
		 */
		boolean bool = mat.matches();
		// 결과 변수
		String result = "맞는 전화번호 형식입니다.";
		if(!bool) {
			result = "전화번호 형식에 맞지 않습니다.";
		}
		JOptionPane.showMessageDialog(null, "입력하신 번호 [ " + tel + " ] 는 " + result);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
