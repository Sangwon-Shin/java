package day10_221025;

public class Ex01 {
	public Ex01() {
		// 랜덤하게 도형을 만들어서 Figure 배열에 10개를 채워넣고 면적을 출력하세요
		int arrLen = 10;
		Figure[] figs = new Figure[arrLen];
		for (int i = 0; i < arrLen; i++) {
			int rnum = (int) (Math.random() * 3);
			System.out.println("↓↓↓↓↓ " + (i+1) + " ↓↓↓↓↓");
			switch (rnum) {
			case 0:
				Won fig1 = new Won(); 
				figs[i] = fig1;
				fig1.rad = (int) (Math.random() * 16 + 5);
				fig1.setAround();
				fig1.setArea();
				fig1.toPrint();
				break;
			case 1:
				Semo fig2 = new Semo();
				figs[i] = fig2;
				fig2.width = (int) (Math.random() * 16 + 5);
				fig2.height = (int) (Math.random() * 16 + 5);
				fig2.setArea();
				fig2.toPrint();
				break;
			case 2:
				Nemo fig3 = new Nemo();
				figs[i] = fig3;
				fig3.width = (int) (Math.random() * 16 + 5);
				fig3.height = (int) (Math.random() * 16 + 5);
				fig3.setAround();
				fig3.setArea();
				fig3.toPrint();
				break;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
