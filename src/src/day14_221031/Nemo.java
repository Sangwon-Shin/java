package day14_221031;

public class Nemo {
	private int width, height;
	private double area;

	public Nemo() {
		/*
		width = 1;
		height = 1;
		setArea();
		*/
		this(1, 1);	// 이 클래스의 다른 생성자를 new 쓰지 않는 곳에서 호출
	}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
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
		area = width * height;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void Test01() {
		new Nemo();	// 가로 세로가 1인 Nemo가 만들어진다.
		// this(); 여기서는 이것을 쓰면 에러 발생.
	}
}
