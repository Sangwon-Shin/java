package day20_221108.Ex01;

public class Dongle implements Figure {
	private int rad;
	private double area, around;
	
	public Dongle() {}
	public Dongle(int rad) {
		setRad(rad);
		setArea();
		setAround();
	}
	public void toPrint() {
		System.out.printf("원     | 반지름: %2d | 둘레: %4.1f | 넓이: %5.1f\n"
				, this.getRad(), this.getAround(), this.getArea());
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	@Override
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = Math.PI * rad * rad;
	}
	
	public double getAround() {
		return around;
	}
	public void setAround() {
		around = 2 * Math.PI * rad;
	}
	
	
}
