package day13_221028;

public class Circle {
	private int rad;
	private double around, area;
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getAround() {
		return around;
	}
	public void setAround() {
		around = 2 * Math.PI * rad;
	}
	public void setAround(double around) {
		this.around = around;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = Math.PI * rad * rad;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
}
