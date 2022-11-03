package day17_221103;
import day17_221103.Figure;

public class Dongle extends Figure {
	private int rad;
	private double area, around;
	
	public Dongle() {}
	public Dongle(int rad) {
		this.rad = rad;
		setAround();
		setArea();
	}

	@Override
	public void setArea() {
		area = rad * rad * Math.PI;
	}

	@Override
	public void toPrint() {
		System.out.printf("원\n\t반지름: %2d\n\t둘레: %5.2f\n\t넓이: %5.2f\n\n", rad, around, area);
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArea() {
		return area;
	}
	public double getAround() {
		return around;
	}
	public void setAround() {
		around = 2 * rad * Math.PI;
	}
}
