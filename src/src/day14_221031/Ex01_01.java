/*
 	3 이상 7 이하 랜덤 정수 만들어서 그 정수만큼의 Semo 객체를 만들어서
 	정보를 출력해주는 프로그램을 작성하세요
 	(배열 안써도 됨)
 */
package day14_221031;

public class Ex01_01 {

	public Ex01_01() {
		int cnt = (int)(Math.random() * 5 + 3);
		/*
		for(int i = 0 ; i < cnt; i++) {
			Semo s = new Semo();
			setWidth(s);
			setHeight(s);
			setArea(s);
			System.out.printf("Triangle %d\nWidth: %d\tHeight: %d\tArea: %4.1f\n\n",
					i+1, s.width, s.height, s.area);
		}*/
		for(int i = 0; i<1; i++) {
			Semo s1 = new Semo();
			setWidth(s1);
			setHeight(s1);
			setArea(s1);
		}
		//System.out.print(getWidth(s1));	// s1은 지역변수임. 에러 발생
	}
	// 삼각형의 밑변 세팅해주는 함수
	public void setWidth(Semo semo) {
		semo.width = (int)(Math.random() * 16 + 5);
	}
	public int getWidth(Semo semo) {
		return semo.width;
	}
	// 삼각형의 높이 세팅해주는 함수
	public void setHeight(Semo semo) {
		semo.height = (int)(Math.random() * 16 + 5);
	}
	public int getHeight(Semo semo) {
		return semo.height;
	}
	// 삼각형의 넓이 세팅해주는 함수
	public void setArea(Semo semo) {
		semo.area = 0.5 * semo.width * semo.height;
	}
	public double getArea(Semo semo) {
		return semo.area;
	}
	
	public static void main(String[] args) {
		new Ex01_01();
	}

}
