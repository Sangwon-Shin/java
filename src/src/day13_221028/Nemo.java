package day13_221028;

public class Nemo {
	private int garo, sero;
	private double area;
	
	public void setGaro(int garo) {
		this.garo = garo;
		return;
	}
	
	public int getGaro() {
		return garo;
	}
	
	public void setSero(int sero) {
		this.sero = sero;
		return;
	}
	
	public int getSero() {
		return sero;
	}
	
	// Overloading
	public void setArea() {
		area = garo * sero;
		return;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}
	
}
