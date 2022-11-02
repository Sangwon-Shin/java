package day16_221102.ex;

public class Semo extends Dohyung {
	int width, height;
	double area;
	public Semo() {	}
	public Semo(int width, int height) {
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
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = 0.5 * width * height;
	}
	public void toPrint() {
		System.out.printf("이것은 삼각형\n"
				+ "밑변: %4d\n높이: %4d\n넓이: %4.1f\n\n", width, height, area);
	}

}
