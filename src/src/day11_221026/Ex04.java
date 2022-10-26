/*
 *  문제 4]
 *  	계산식(두 자연수의 사칙연산)을 입력받아서
 *  	그 식을 숫자와 연산기호를 기억할 배열을 만들어서 기억시키고
 *  	그 배열을 이용한 계산기 프로그램을 작성해서 실행하세요
 */

package day11_221026;

import java.util.*;

public class Ex04 {

	public Ex04() {
		String[] eqn = new String[4];
		Scanner sc = new Scanner(System.in);
		String eq = sc.nextLine();
		eq = eq.replaceAll(" ", "");
		for (int i = 0; i < eq.length(); i++) {
			switch (eq.charAt(i)) {
			case '+':
				eqn[0] = eq.substring(0, i);
				eqn[1] = "+";
				eqn[2] = eq.substring(i + 1);
				eqn[3] = (Integer.parseInt(eqn[0]) + Integer.parseInt(eqn[2])) + "";
				break;
			case '-':
				eqn[0] = eq.substring(0, i);
				eqn[1] = "-";
				eqn[2] = eq.substring(i + 1);
				eqn[3] = (Integer.parseInt(eqn[0]) - Integer.parseInt(eqn[2])) + "";
				break;
			case '*':
				eqn[0] = eq.substring(0, i);
				eqn[1] = "*";
				eqn[2] = eq.substring(i + 1);
				eqn[3] = (Integer.parseInt(eqn[0]) * Integer.parseInt(eqn[2])) + "";
				break;
			case '/':
				eqn[0] = eq.substring(0, i);
				eqn[1] = "/";
				eqn[2] = eq.substring(i + 1);
				eqn[3] = (1.0 * Integer.parseInt(eqn[0]) / Integer.parseInt(eqn[2])) + "";
				break;
			}
		}
		for(int i = 0; i < 3; i++) {
			System.out.print(eqn[i] + " ");
		}
		System.out.print("= " + eqn[3]);
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
