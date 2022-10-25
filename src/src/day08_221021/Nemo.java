package day08_221021;

public class Nemo {
	public int width, height, around, area;	 // 멤버들에 public 붙이면 다른 패키지에서 접근 가능
	public void setAround() {
		around = 2 * (width + height);
	}
	public void setArea() {
		area = width * height;
	}
	
}
