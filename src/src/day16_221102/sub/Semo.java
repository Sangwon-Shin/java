package day16_221102.sub;

public class Semo extends Figure {
	private int width, height;
	private double area;
	// private int no; 이걸 안쓰면 no는 상속된 멤버변수가 아니라서 Test01에서
	// no = 70 이 된다. 보통은 변수가 레퍼런스쪽을 따라야 하므로 Figure 에서의 no
	// 값인 100이어야 한다.
	public Semo() {}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		no = 70;
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
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public void toPrint() {
		System.out.printf(
				"밑변: %3d\n높이: %3d\n넓이: %5.2f\n\n", width, height, area);
	}
}
