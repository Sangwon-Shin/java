package day17_221103.sub;

public class Circle implements Figure {
	private int rad;
	private double around, area;
	
	public Circle() {}
	public Circle(int rad) {
		this.rad = rad;
		setAround();
		setArea();
	}

	@Override
	public void toPrint() {
		System.out.printf("%-5s - %4s: %3d,  %2s: %7.2f,  %2s: %7.2f\n\n",
				"원", "반지름", rad, "둘레", around, "넓이", area);
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
	// overloading
	public void setAround() {
		around = 2 * Math.PI * rad;
	}
	public double getArea() {
		return area;
	}
	// overloading
	public void setArea() {
		area = Math.PI * rad * rad;
	}

}
