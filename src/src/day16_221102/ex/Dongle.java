package day16_221102.ex;

public class Dongle extends Dohyung {
	int rad;
	double around, area;
	public Dongle() { }
	public Dongle(int rad) {
		setRad(rad);
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
	public void setAround() {
		around = 2 * 3.141592 * rad;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = 3.141592 * rad * rad;
	}
	public void toPrint() {
		System.out.printf("이것은 원\n"
				+ "반지름: %2d\n  둘레: %4.1f\n  넓이: %4.1f\n\n", rad, around, area);
	}
}
