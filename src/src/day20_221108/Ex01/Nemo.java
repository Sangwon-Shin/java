package day20_221108.Ex01;

public class Nemo implements Figure {
	private int garo, sero;
	private double area;
	
	public Nemo() {}
	public Nemo(int garo, int sero) {
		setGaro(garo);
		setSero(sero);
		setArea();
	}
	
	public void toPrint() {
		System.out.printf("사각형 | 가로: %4d | 세로: %4d | 넓이: %5.1f\n"
				, this.getGaro(), this.getSero(), this.getArea());
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
	@Override
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = garo * sero;
	}
	
	
}
