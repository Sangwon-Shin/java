package day20_221108.Ex02;

public class Semo implements Figure {
	private int width, height;
	private double area;
	
	public Semo() {}
	public Semo(int width, int height) {
		setWidth(width);
		setHeight(height);
		setArea();
	}
	public void toPrint() {
		System.out.printf("삼각형 | 밑변: %4d | 높이: %4d | 넓이: %5.1f\n"
				, this.getWidth(), this.getHeight(), this.getArea());
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
	@Override
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = 0.5 * width * height;
	}
	
	/*
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	*/
	
}
