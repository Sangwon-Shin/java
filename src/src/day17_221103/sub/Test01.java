package day17_221103.sub;
import static java.lang.Math.*;
public class Test01 {
	Figure[] arr;
	public Test01() {
		setArr();
		printArr();
	}
	// 배열세팅함수
	public void setArr() {
		int arrlen = 5;
		arr = new Figure[arrlen];
		for(int i = 0; i < arrlen; i++) {
			int rdn = (int)(random() * 3);
			switch(rdn) {
			case 0:
				arr[i] = new Circle((int)(random() * 16 + 5));
				break;
			case 1:
				arr[i] = new Semo((int)(random() * 16 + 5), (int)(random() * 16 + 5));
				break;
			case 2:
				arr[i] = new Nemo((int)(random() * 16 + 5), (int)(random() * 16 + 5));
				break;
			}
		}
	}
	public void printArr() {
		for(int i = 0; i < arr.length; i++) {
			arr[i].toPrint();
		}
	}
	public static void main(String[] args) {
		new Test01();
	}

}
