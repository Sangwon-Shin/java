package day20_221108;

public class Samgak implements Comparable {
	private int width, height;
	private double area;
	public Samgak() {}
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	// this 객체와 다른 객체를 비교하는 함수를 만들면 된다.
	@Override
	public int compareTo(Object o) {
		int result = 0;
		Samgak s = (Samgak) o;
		// 중복값 추가하지 않으려면 동등비교 해줘야한다.
		result = getArea() == s.getArea() ? 0 :
					getArea() < s.getArea() ? 1 : -1;
		return result;
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
