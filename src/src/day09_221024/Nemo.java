package day09_221024;

public class Nemo {
	int width, height, around, area;
	@Override
	public String toString() {
		return "가로가 " + width + " 이고\n 세로가" + height + "이고\n 면적이"
				+ area + " 인 사각형입니다";
	}
	void setAround() {
		around = 2 * (width + height);
	}
	void setArea() {
		area = width * height;
	}
	
}
