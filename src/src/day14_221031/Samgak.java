package day14_221031;

public class Samgak {
	public int width, height;
	public double area;
	public Samgak() {// 기본 생성자. 생성자가 하나도 정의되지 않으면 JVM이 만든다.
		this(1, 1);
	} 
	public Samgak(int width, int height) {
		// 밑변과 높이를 세팅해주면서 객체를 만들어주는 생성자
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public void  setArea() {
		this.area = 0.5 * width * height;
	}
	public void  setArea(double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "밑변이 " + width + " 이고\n높이가 " + height + " 이고\n면적이 " + area + " 인 삼각형";
	}
}
