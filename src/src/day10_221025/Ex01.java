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
				Won won = new Won(); 
				figs[i] = won;
				won.rad = (int) (Math.random() * 16 + 5);
				won.setAround();
				won.setArea();
				won.toPrint();
				break;
			case 1:
				Semo semo = new Semo();
				figs[i] = semo;
				semo.width = (int) (Math.random() * 16 + 5);
				semo.height = (int) (Math.random() * 16 + 5);
				semo.setArea();
				semo.toPrint();
				break;
			case 2:
				Nemo nemo = new Nemo();
				figs[i] = nemo;
				nemo.width = (int) (Math.random() * 16 + 5);
				nemo.height = (int) (Math.random() * 16 + 5);
				nemo.setAround();
				nemo.setArea();
				nemo.toPrint();
				break;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
