package day17_221103.sub;

public class Nemo implements Figure {
	private int garo, sero;
	private double area;
	public Nemo() {}
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}

	@Override
	public void toPrint() {
		System.out.printf("%s - %5s: %3d,  %2s: %7d,  %2s: %7.2f\n\n",
				"사각형", "가로", garo, "세로", sero, "넓이", area);
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
