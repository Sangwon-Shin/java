/*
	Figure 인터페이스를 만들고 그것을 구현하는 클래스 
	Dongle, Semo, Nemo 클래스를 만드세요.
	단, Comparable 인터페이스를 구현하지 않는 클래스로 제작하세요.
	(Comparator 를 이용)
	
	0 이상 2 이하 정수를 랜덤하게 발생시켜서
	0 : Dongle
	1 : Semo
	2 : Nemo
	를 채워넣을 TreeSet 을 만들어서 채우고
	면적 기준으로 내림차순 정렬해서 출력하세요.
	
*/
package day20_221108.Ex01;
import java.util.*;
public class Ex01 {
	private int nFig = 10;

	public Ex01() {
		TreeSet set = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Figure f1 = (Figure) o1;
				Figure f2 = (Figure) o2;
				int res = f1.getArea() == f2.getArea() ? 0 :
							f1.getArea() < f2.getArea() ? 1 : -1;
				return res;
			}
		}); 
		for (int i = 0; i < nFig; i++) {
			int rnum = (int) (Math.random() * 3);
			switch (rnum) {
			case 0:
				int rad = (int) (Math.random() * 16 + 5) / 2;
				Dongle dongle = new Dongle(rad);
				set.add(dongle);
				break;
			case 1:
				int width = (int) (Math.random() * 16 + 5);
				int height = (int) (Math.random() * 16 + 5);
				Semo semo = new Semo(width, height);
				set.add(semo);
				break;
			case 2:
				int garo = (int) (Math.random() * 16 + 5);
				int sero = (int) (Math.random() * 16 + 5);
				Nemo nemo = new Nemo(garo, sero);
				set.add(nemo);
				break;
			}
		}
		Iterator<Figure> itor = set.iterator();
		while(itor.hasNext()) {
			itor.next().toPrint();
		}
	}

	
	public static void main(String[] args) {
		new Ex01();
	}

}
