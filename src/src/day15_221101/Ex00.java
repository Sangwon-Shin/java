/*
 	학생의 이름, java, DB, web, 총점, 평균 점수, 순위를 기억할 
 	Student 클래스를 제작하고
 	이 클래스가 객체가 될 때 필요한 데이터를 입력받아서 객체가 될 수 있도록
 	하고 변수는 은닉화 하세요
 	
 	1. 다섯명의 학생의 점수를 기억할 배열을 만들고 학생을 입력하세요
 	
 	2. 1번 문항의 학생들의 순위를 계산해서 세팅하세요.
 	
 	3. 총점 기준 내림차순 정렬하세요

 	extra]
 		랜덤하게 3이상 7이하 정수로 학생수를 지정하여 기억할 배열을 만들고
 		학생들의 정보를 입력해서 위 문항의 1~3 내용으로 해결하세요  
 */

package day15_221101;

public class Ex00 {

	public Ex00() {
		int nstd = (int)(Math.random() * 5 + 3);
		Student[] stds = new Student[nstd];
		String[] names = {"jennie", "lisa", "rose", "jisoo", "jieun", "wonyoung", "eujin"};
		
		for(int i = 0; i < nstd; i++) {
			int java = (int)(Math.random() * 41 + 60);
			int db = (int)(Math.random() * 41 + 60);
			int web = (int)(Math.random() * 41 + 60);
			stds[i] = new Student(names[i], java, db, web);
		}
		// ******* ↓↓↓↓↓ 인터페이스에서 쓰이는 정렬 방식 ↓↓↓↓↓ 
		for(int i = 0; i < stds.length; i++) {
			stds[i].setRank(1);
			for(int j = 0; j < stds.length; j++) {
				stds[i].setRank(stds[j]);
			}
		}
		printStd(stds);
	}

	public static void main(String[] args) {
		new Ex00();
	}
	
	public void setAlignRank(Student[] stds) {
		for(int i = 0; i < stds.length - 1; i++) {
			for(int j = i + 1; j < stds.length; j++) {
				if(stds[i].getSum() < stds[j].getSum()) {
					Student tmp = new Student();
					tmp = stds[i];
					stds[i] = stds[j];
					stds[j] = tmp;
				}
			}
		}
		for(int i = 0; i < stds.length; i++) {
			stds[i].setRank(i+1);
		}
	}
	
	public void printStd(Student std) {
		System.out.printf("%s\njava 점수: %3d\tDB 점수: %3d\tweb 점수: %3d\n"
				+ "총점: %3d\t평균: %3.1f\t 순위: %3d\n\n", std.getName(),
				std.getJava(), std.getDb(), std.getWeb(), std.getSum(),
				std.getAvg(), std.getRank());
	}
	
	public void printStd(Student[] stds) {
		for(int i = 0; i < stds.length; i++) {
			System.out.printf("%s\njava 점수: %3d\tDB  점수: %3d\tweb 점수: %3d\n"
					+ "총점: %3d\t평균: %3.1f\t 순위: %3d\n\n", stds[i].getName(),
					stds[i].getJava(), stds[i].getDb(), stds[i].getWeb(), stds[i].getSum(),
					stds[i].getAvg(), stds[i].getRank());
		}
	}
}
