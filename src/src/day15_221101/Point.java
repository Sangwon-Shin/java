package day15_221101;

public class Point {
	private int x, y;
	
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(int[] num) {
		this.x = num[0];
		this.y = num[1];
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setXy(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void toPrint() {
		System.out.printf("x: %3d | y: %3d\n", x,y);
	}
	
	
}
