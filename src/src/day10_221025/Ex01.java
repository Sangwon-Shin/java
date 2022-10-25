package day10_221025;

public class Ex01 {
	public Ex01() {
		// 랜덤하게 도형을 만들어서 Figure 배열에 10개를 채워넣고 넓이 오름차순으로 출력하세요
		int arrLen = 10;
		Figure[] figs = new Figure[arrLen];
		for (int i = 0; i < arrLen; i++) {
			int rnum = (int) (Math.random() * 3);
			switch (rnum) {
			case 0:
				Won won = new Won();
				figs[i] = won;
				won.rad = (int) (Math.random() * 16 + 5);
				won.setAround();
				won.setArea();
				break;
			case 1:
				Semo semo = new Semo();
				figs[i] = semo;
				semo.width = (int) (Math.random() * 16 + 5);
				semo.height = (int) (Math.random() * 16 + 5);
				semo.setArea();
				break;
			case 2:
				Nemo nemo = new Nemo();
				figs[i] = nemo;
				nemo.width = (int) (Math.random() * 16 + 5);
				nemo.height = (int) (Math.random() * 16 + 5);
				nemo.setAround();
				nemo.setArea();
				break;
			}
		}
		double area1 = 0;
		double area2 = 0;
		for (int i = 0; i < arrLen - 1; i++) {
			if (figs[i] instanceof Won) {
				area1 = ((Won) figs[i]).area;
			} else if (figs[i] instanceof Semo) {
				area1 = ((Semo) figs[i]).area;
			} else if (figs[i] instanceof Nemo) {
				area1 = ((Nemo) figs[i]).area;
			}
			for (int j = i + 1; j < arrLen; j++) {
				if (figs[j] instanceof Won) {
					area2 = ((Won) figs[j]).area;
				} else if (figs[j] instanceof Semo) {
					area2 = ((Semo) figs[j]).area;
				} else if (figs[j] instanceof Nemo) {
					area2 = ((Nemo) figs[j]).area;
				}
				if (area1 > area2) {
					Figure tmp = new Figure();
					tmp = figs[j];
					figs[j] = figs[i];
					figs[i] = tmp;
					area1 = area2;
				}
			}
		}
		for(int i = 0; i < arrLen; i++) {
			System.out.println("↓↓↓↓↓ " + (i + 1) + " ↓↓↓↓↓");
			figs[i].toPrint();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
