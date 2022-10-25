package day08_221021;

public class Won {
	public int rad;	// 멤버변수, 메소드에 public을 붙이면 다른 패키지에서도 참조 가능
	public double around;
	public double area;
	public void setAround() {
		this.around = 2 * Math.PI * this.rad;
	}
	public void setArea() {
		this.area = Math.PI * this.rad * this.rad;
	}
}
