package day24_221114;

public class Nemo {
	private int width, height;
	private double area;
	public Nemo() {}
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
	@Override
	public boolean equals(Object o) {
		/* 
		  	이 함수는 Object 클래스에서 상속받은 함수로, 
		  	원래는 주소를 비교하는 기능을 하지만
		  	여기서는 넓이가 같으면 같은 사각형으로 처리하기로 해보자.
		 */
		Nemo n = (Nemo) o;
		boolean bool = area == n.getArea();
		return bool;
	}
	@Override
	public String toString() {
		return "가로: " + width + ", 세로: " + height + ", 넓이: " + area + "인 네모"; 
	}
}
