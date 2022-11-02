/*
	"여기는 도형 클래스" 를 출력하는 기능을 가진 Dohyung 클래스를 제작하고
	Dohyung 클래스를 상속받아서 
		Semo, Nemo, Dongle
	클래스를 제작하고
	
	랜덤하게 0이상 2이하 정수를 5개 생성해서
	 	0: Dongle
	 	1: Semo
	 	2: Nemo
	 의 인스턴스를 Dohyung 배열에 채워넣어서
	 내용을 출력해주는 프로그램을 작성하세요
 */

package day16_221102.ex;

public class Ex01 {

	public Ex01() {
		int ndoh = 20;
		Dohyung[] dohs = new Dohyung[ndoh];
		for(int i = 0; i < ndoh; i++) {
			int rnum = (int)(Math.random() * 3);
			switch(rnum) {
			case 0:
				int rad = (int)(Math.random() * 16 + 5)/2;
				dohs[i] = new Dongle(rad);
				break;
			case 1:
				int width = (int)(Math.random() * 16 + 5);
				int height = (int)(Math.random() * 16 + 5);
				dohs[i] = new Semo(width, height);
				break;
			case 2:
				int width2 = (int)(Math.random() * 16 + 5);
				int height2 = (int)(Math.random() * 16 + 5);
				dohs[i] = new Nemo(width2, height2);
				break;
			}
		}
		// 넓이 오름차순 정렬
		for(int i = 0; i < dohs.length - 1; i++) {
			double area1, area2;
			if(dohs[i] instanceof Dongle) {
				area1 = ((Dongle)dohs[i]).getArea();
			}
			else if(dohs[i] instanceof Semo) {
				area1 = ((Semo)dohs[i]).getArea();
			}
			else {
				area1 = ((Nemo)dohs[i]).getArea();
			}
			for(int j = i + 1; j < dohs.length; j++) {
				if(dohs[j] instanceof Dongle) {
					area2 = ((Dongle)dohs[j]).getArea();
				}
				else if(dohs[j] instanceof Semo) {
					area2 = ((Semo)dohs[j]).getArea();
				}
				else {
					area2 = ((Nemo)dohs[j]).getArea();
				}
				if(area1 > area2) {
					Dohyung tmp = new Dohyung();
					tmp = dohs[i];
					dohs[i] = dohs[j];
					dohs[j] = tmp;
					area1 = area2;
				}
			}
		}
		for(Dohyung dh : dohs) {
			dh.toPrint();
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}
}
