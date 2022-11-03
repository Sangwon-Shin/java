package day17_221103;
import day17_221103.Figure;

public class Semo extends Figure {
	private int width, height;
	private double area;
	
	public Semo() {}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	@Override
	public void setArea() {
		area = 0.5 * width * height;
	}
	@Override
	public void toPrint() {
		System.out.printf("삼각형\n\t밑변: %2d\n\t높이: %2d\n\t넓이: %5.2f\n\n", width, height, area);
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

}
