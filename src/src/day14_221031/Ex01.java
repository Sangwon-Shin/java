/*
 	3 이상 7 이하 랜덤 정수 만들어서 그 정수만큼의 Semo 객체를 만들어서
 	정보를 출력해주는 프로그램을 작성하세요
 	(배열 안써도 됨)
 */
package day14_221031;

public class Ex01 {

	public Ex01() {
		int rnum = (int)(Math.random() * 5 + 3);
		System.out.println("랜덤하게 생성한, 만들려는 삼각형의 개수: " + rnum);
		System.out.println();
		for(int i = 0; i < rnum; i++) {
			Semo tr = new Semo();
			tr.width = (int)(Math.random() * 16 + 5);
			tr.height = (int)(Math.random() * 16 + 5);
			tr.area = 0.5 * tr.width * tr.height;
			System.out.println("triangle " + (i + 1));
			System.out.print("width: " + tr.width);
			System.out.print("\theight: " + tr.height);
			System.out.print("\tarea: " + tr.area);
			System.out.print("\n\n");
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
