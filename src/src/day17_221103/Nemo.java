package day17_221103;
import day17_221103.Figure;

public class Nemo extends Figure {
	private int garo, sero;
	private double area;
	
	public Nemo() {}
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	
	@Override
	public void setArea() {
		area = garo * sero;
	}

	@Override
	public void toPrint() {
		System.out.printf("사각형\n\t가로: %2d\n\t세로: %2d\n\t넓이: %5.2f\n\n", garo, sero, area);
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



	

	

}
