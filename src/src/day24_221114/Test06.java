package day24_221114;
/*
	점수를 입력받아서 학점을 출력해주는 프로그램을 작성하세요
 */

import java.text.*;
import javax.swing.*;

public class Test06 {
	
	public Test06() {
		// limits 배열
		double[] limits = {0, 60, 70, 80, 90};
		/*
			limits 배열 만들 때 주의사항
				반드시 오름차순으로 정렬되어야 한다.
		 */
		String[] formats = {"F", "D", "C", "B", "A"};
		// formats 만들 때 주의사항: limits 개수와 반드시 일치시켜야 한다.
		// 형식 만들고
		ChoiceFormat form = new ChoiceFormat(limits, formats);
		// 점수 입력받고
		String sno = JOptionPane.showInputDialog("점수 입력: ");
		// 정수로 변환하고
		int score = Integer.parseInt(sno);
		// 학점 계산하고
		String grade = form.format(score);
		// 출력하고
		JOptionPane.showMessageDialog(null, "입력받은 점수: " + score + "\n학점: " + grade);
	}

	public static void main(String[] args) {
		new Test06();
	}

}
