/*
 * 	도형 10개를 기억할 배열을 만들고 랜덤하게 0~2 정수를 발생시켜서
 * 	0이면 원으로, 1이면 삼각형으로, 2이면 사각형으로 
 * 	배열에 모두 채워주고 내용을 출력해주는 프로그램을 작성하세요.
 */
package day11_221026;

import day10_221025.*;

public class Ex01 {
	public Ex01() {
		int arrLen = 10;
		Figure[] figs = new Figure[arrLen];
		int rnum = (int) (Math.random() * 3);
		switch (rnum) {
		case 0:
			for (int i = 0; i < arrLen; i++) {
				figs[i] = new Won();
				((Won) figs[i]).rad = (int) (Math.random() * 16 + 5);
				((Won) figs[i]).setArea();
				((Won) figs[i]).setAround();
			}
			break;
		case 1:
			for (int i = 0; i < arrLen; i++) {
				figs[i] = new Semo();
				((Semo) figs[i]).width = (int) (Math.random() * 16 + 5);
				((Semo) figs[i]).height = (int) (Math.random() * 16 + 5);
				((Semo) figs[i]).setArea();
			}
			break;
		case 2:
			for (int i = 0; i < arrLen; i++) {
				figs[i] = new Nemo();
				((Nemo) figs[i]).width = (int) (Math.random() * 16 + 5);
				((Nemo) figs[i]).height = (int) (Math.random() * 16 + 5);
				((Nemo) figs[i]).setArea();
				((Nemo) figs[i]).setAround();
			}
			break;
		}
		double area1 = 0;
		double area2 = 0;
		for (int i = 0; i < arrLen-1; i++) {
			switch(rnum) {
			case 0:
				area1 = ((Won) figs[i]).area;
				break;
			case 1:
				area1 = ((Semo) figs[i]).area;
				break;
			case 2:
				area1 = ((Nemo) figs[i]).area;
				break;
			}
			for(int j = i+1; j<arrLen;j++ ) {
				switch(rnum) {
				case 0:
					area2 = ((Won) figs[j]).area;
					break;
				case 1:
					area2 = ((Semo) figs[j]).area;
					break;
				case 2:
					area2 = ((Nemo) figs[j]).area;
					break;
				}
				if(area1 > area2) {
					Figure tmp = new Figure();
					tmp = figs[i];
					figs[i] = figs[j];
					figs[j] = tmp;
					area1 = area2;
				}
			}
		}
		for (int i = 0; i < arrLen; i++) {
			System.out.printf("↓ figs[%d] ↓\n", i);
			figs[i].toPrint();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
