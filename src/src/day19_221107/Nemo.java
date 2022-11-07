package day19_221107;

public class Nemo {
	private int garo, sero;
	private double area;
	
	public Nemo() {}
	public Nemo(int garo, int sero) {
		setGaro(garo);
		setSero(sero);
		setArea();
	}
	
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
	public void setArea() {
		area = garo * sero;
	}
}
