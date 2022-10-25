package day10_221025;

public class Semo extends Figure{
	public int width, height;
	public void setArea() {
		area = Math.round(0.5 * width * height * 100)/100.; 
	}
	public void toPrint() {
		System.out.println("이 삼각형은"
				+ "\n밑변이 " + width
				+ "\n높이가 " + height
				+ "\n넓이가 " + area
				+ "\n이다.");
	}
}
