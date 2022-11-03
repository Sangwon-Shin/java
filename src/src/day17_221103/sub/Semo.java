package day17_221103.sub;

public class Semo implements Figure {
	private int width, height;
	private double area;
	public Semo() {	}
	public Semo(int width, int height) {	
		this.width = width;
		this.height = height;
		setArea();
	}
	
	@Override
	public void toPrint() {
		System.out.printf("%s - %5s: %3d,  %2s: %7d,  %2s: %7.2f\n\n",
				"삼각형", "밑변", width, "높이",height, "넓이", area);
	}
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea() {
		area = 0.5 * width * height;
	}


}
