/*
 	계산기 프로그램을 작성해서 실행하세요
 	
 	수식입력
 	계산
 	출력 기능은 각각의 함수로 작성해서 구현하세요
 */

package day13_221028;

import java.util.Scanner;

public class Ex03 {
	String[] arrEqn = new String[4];

	public Ex03() {
		System.out.println("두 수에 대한 사칙연산 식을 입력하세요");
		parseCalcEqn(getEqn());
		printAns(arrEqn[3]);
	}

	public static void main(String[] args) {
		new Ex03();
	}

	public String getEqn() {
		Scanner sc = new Scanner(System.in);
		String eqn = sc.nextLine();
		sc.close();
		return eqn;
	}

	public void parseCalcEqn(String eqn) {
		eqn = eqn.replaceAll(" ", "");
		double ans = 0;
		double num1 = 0;
		double num2 = 0;
		ff: 
		for (int i = 0; i < eqn.length(); i++) {
			switch (eqn.charAt(i)) {
			case '+':
				arrEqn[0] = eqn.substring(0, i);
				arrEqn[1] = "+";
				arrEqn[2] = eqn.substring(i + 1);
				arrEqn[3] = Double.parseDouble(arrEqn[0]) + Double.parseDouble(arrEqn[2]) + "";
				break ff;
			case '-':
				arrEqn[0] = eqn.substring(0, i);
				arrEqn[1] = "-";
				arrEqn[2] = eqn.substring(i + 1);
				arrEqn[3] = Double.parseDouble(arrEqn[0]) - Double.parseDouble(arrEqn[2]) + "";
				break ff;
			case '*':
				arrEqn[0] = eqn.substring(0, i);
				arrEqn[1] = "*";
				arrEqn[2] = eqn.substring(i + 1);
				arrEqn[3] = Double.parseDouble(arrEqn[0]) * Double.parseDouble(arrEqn[2]) + "";
				break ff;
			case '/':
				arrEqn[0] = eqn.substring(0, i);
				arrEqn[1] = "/";
				arrEqn[2] = eqn.substring(i + 1);
				if (Double.parseDouble(arrEqn[2]) == 0.) {
					System.out.println("0으로 나눌 수 없습니다.");
					return;
				}
				arrEqn[3] = Double.parseDouble(arrEqn[0]) / Double.parseDouble(arrEqn[2]) + "";
				break ff;
			}
		}
	}

	public void printAns(String ansStr) {
		System.out.println("= " + Double.parseDouble(ansStr));
		}
		
	}
