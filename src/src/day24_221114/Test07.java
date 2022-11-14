package day24_221114;
/*
	점수를 입력받아서 학점을 계산해서 출력하세요
 */
import java.text.*;
import javax.swing.*;

public class Test07 {
/*
	ChoiceFormat 을 만들 때 limits 와 formats 를 하나로 만들 수 있다.
	만드는 형식]
		60#D	← <= (greater than or equal to)를 의미
		70<C	← < 를 의미
		
		이것을 "|" 를 이용해서 연결해서 사용하면 된다.
 */
	public Test07() {
		String pattern = "0#F|60#D|70#C|80#B|90<A"; // 90 초과부터 A라고 바꿔보자 
		ChoiceFormat form = new ChoiceFormat(pattern);
		String sno = JOptionPane.showInputDialog("점수 입력: ");
		int score = Integer.parseInt(sno);
		
		// 학점 계산
		String grade = form.format(score);
		// 출력
		System.out.println("입력받은 점수 " + score + " 는 " + grade + " 학점입니다.");
	}

	public static void main(String[] args) {
		new Test07();
	}

}
