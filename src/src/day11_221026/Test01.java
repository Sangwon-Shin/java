// 얕은 복사
package day11_221026;

public class Test01 {

	public Test01() {
		Student[] stud = null;
		int no = (int) (Math.random() * 2);
		if (no == 0) {
			Student[] tmp = new Student[10];
			for (int i = 0; i < 10; i++) {
				tmp[i] = new Student();
			}
			stud = tmp;
			
			
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
