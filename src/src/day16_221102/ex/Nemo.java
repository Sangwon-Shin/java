package day16_221102.ex;

public class Nemo extends Dohyung {
	int width, height, area;
	public Nemo() {	}
	public Nemo(int width, int height) {
		setWidth(width);
		setHeight(height);
		setArea();
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return area;
	}
	public void setArea() {
		area = width * height;
	}
	public void toPrint() {
		System.out.printf("이것은 사각형\n"
				+ "밑변: %4d\n높이: %4d\n넓이: %4d\n\n", width, height, area);
	}
}
