/*
	사각형 한 개의 정보를 기억할 Nemo 클래스를 만들고
	랜덤하게 가로와 세로를 입력해서 10개의 사각형을
	ArrayList 에 기억하고
		1. 가로 길이 오름차순 정렬
		2. 면적 내림 차순 정렬
	해서 출력하세요
 */

package day19_221107;
import java.util.*;
public class Ex01 {

	public Ex01() {
		ArrayList<Nemo> arrNemo = new ArrayList<Nemo>();
		int noNemo = 10;
		for(int i = 0; i < noNemo; i++) {
			int garo = (int)(Math.random() * 16 + 5);
			int sero = (int)(Math.random() * 16 + 5);
			Nemo nemo = new Nemo(garo, sero);
			arrNemo.add(nemo);
		}
		
		// 가로 길이 오름차순 정렬
		System.out.println("가로 길이 오름차순 정렬--------------");
		Collections.sort(arrNemo, new NemoAsc("garo"));
		for(Nemo n : arrNemo) {
			nemoPrint(n);
		}
		
		// 넓이 내림차순 정렬
		System.out.println("\n넓이 내림차순 정렬-------------------");
		Collections.sort(arrNemo, new NemoDesc("area"));
		for(Nemo n : arrNemo) {
			nemoPrint(n);
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}
	
	public void nemoPrint(Nemo nemo) {
		System.out.printf("가로: %3d | 세로: %3d | 넓이: %5.0f\n",
				nemo.getGaro(), nemo.getSero(), nemo.getArea());
	}
}

class NemoAsc implements Comparator{
	private int para = 3;
	public NemoAsc() {}
	public NemoAsc(String para) {
		switch(para.toLowerCase()) {
		case "garo":
			this.para = 1;
			break;
		case "sero":
			this.para = 2;
			break;
		}
	}
	@Override
	public int compare(Object o1, Object o2) {
		double no1 = 0;
		double no2 = 0;
		int result = 0;
		switch(para) {
		case 1:
			no1 = ((Nemo) o1).getGaro();
			no2 = ((Nemo) o2).getGaro();
			break;
		case 2:
			no1 = ((Nemo) o1).getSero();
			no2 = ((Nemo) o2).getSero();
			break;
		case 3:
			no1 = ((Nemo) o1).getArea();
			no2 = ((Nemo) o2).getArea();
			break;
		}
		result = no1 > no2 ? 1 : -1;
		return result;
	}
	
}

class NemoDesc implements Comparator{
	private int para = 3;
	public NemoDesc() {}
	public NemoDesc(String para) {
		switch(para.toLowerCase()) {
		case "garo":
			this.para = 1;
			break;
		case "sero":
			this.para = 2;
			break;
		}
	}
	@Override
	public int compare(Object o1, Object o2) {
		double no1 = 0;
		double no2 = 0;
		int result = 0;
		switch(para) {
		case 1:
			no1 = ((Nemo) o1).getGaro();
			no2 = ((Nemo) o2).getGaro();
			break;
		case 2:
			no1 = ((Nemo) o1).getSero();
			no2 = ((Nemo) o2).getSero();
			break;
		case 3:
			no1 = ((Nemo) o1).getArea();
			no2 = ((Nemo) o2).getArea();
			break;
		}
		result = no2 > no1 ? 1 : -1;
		return result;
	}
	
}