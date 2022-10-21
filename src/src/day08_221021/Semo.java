package day08_221021;

public class Semo {
	int width, height;
	double area;
	// 밑변과 높이가 결정된 후 호출되면 면적값을 area에 넣는 함수
	public void setArea() {
		area = 0.5 * width * height;
	}
}
