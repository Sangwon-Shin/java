package day13_221028;

public class Semo {
	private int garo, sero;
	private double area;
	
	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public double getArea() {
		return area;
	}
	
	// Overloading
	public void setArea() {
		area = garo * sero;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
		
	}


