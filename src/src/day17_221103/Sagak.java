package day17_221103;

public class Sagak extends Nemo {
	private int width, height;
	private double area; 
	public Sagak() {}
	
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	@Override
	public void setArea() {
		area = width * height;
	}
	@Override
	public void toPrint() {
		System.out.printf("사각형\n\t가로: %2d\n\t세로: %2d\n\t넓이: %5.2f\n\n", width, height, area);
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

	public void setArea(double area) {
		this.area = area;
	}
}
