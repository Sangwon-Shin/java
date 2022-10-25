package day10_221025;

public class Nemo extends Figure{
	public int width, height, around;
	public void setArea() {
		area = Math.round(width * height * 100)/100.;
	}
	
	public void setAround() {
		around = 2 * (width + height);
	}
	
	public void toPrint() {
		System.out.println("이 사각형은"
				+ "\n밑변이 " + width
				+ "\n높이가 " + height
				+ "\n둘레가 " + around
				+ "\n넓이가 " + area
				+ "\n이다.");
	}
}
