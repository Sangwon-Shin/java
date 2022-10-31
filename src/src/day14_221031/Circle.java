package day14_221031;

public class Circle {
	private int rad;
	private double around, area;
	public Circle() {
		this(1);
	}
	public Circle(int rad) {
		this.rad = rad;
		setAround();
		setArea();
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getAround() {
		return around;
	}
	// setAround overloading
	public void setAround() {
		around = 2 * rad * Math.PI;
	}
	public void setAround(double around) {
		this.around = around;
	}
	public double getArea() {
		return area;
	}
	// setArea overloading
	public void setArea() {
		area = Math.PI * rad * rad;
	}
	public void setArea(double area) {
		this.area = area;
	}
}
