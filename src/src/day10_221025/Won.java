package day10_221025;

public class Won extends Figure{
	public int rad;
	public double around;
	public void setAround() {
		around = Math.round(2 * Math.PI * rad * 100)/100.;
	}
	public void setArea() {
		area = Math.round(Math.PI * rad * rad * 100)/100.;
	}
	
	public void toPrint() {
		System.out.println("이 원은"+
				"\n반지름이 " + rad +
				"\n둘레가 " + around +
				"\n넓이가 " + area
				+ "\n이다.");
		
	}
}
