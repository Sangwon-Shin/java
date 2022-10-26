/*
 *  Student 클래스를 이용해서 학생들 10명의 점수를 기억할 배열을 만들고
 *  총점, 평균, 순위를 계산해서 순위대로 정렬하세요.
 */

package day11_221026;

public class Ex02 {
	String[] names = { "제니", "리사", "로제", "지수", "아이유", "경욱", "태윤", "우영", "경민", "혁주" };

	public Ex02() {
		int arrLen = names.length;
		int nsubj = 3; // number of subjects
		Student[] std = new Student[arrLen];// Student 인스턴스를 10개 기억할 공간만 확보한 상태...
		for (int i = 0; i < arrLen; i++) {
			std[i] = new Student(); 
			std[i].name = names[i];
			std[i].kor = (int) (Math.random() * 41 + 60);
			std[i].eng = (int) (Math.random() * 41 + 60);
			std[i].math = (int) (Math.random() * 41 + 60);
			std[i].total = std[i].kor + std[i].eng + std[i].math;
			std[i].avg = (double) std[i].total / nsubj;
		}
		
		for(int i = 0; i < arrLen; i++) {
			int rnk = 1;
			for(int j = 0; j < arrLen; j++) {
				if(std[i].total < std[j].total) {
					rnk += 1;
				}
			}
			std[i].rank = rnk;
		}
		
		for (int i = 0; i < arrLen - 1; i++) {
			for (int j = i + 1; j < arrLen; j++) {
				if (std[i].total < std[j].total) {
					Student tmp = new Student();
					tmp = std[i];
					std[i] = std[j];
					std[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < arrLen; i++) {
			//std[i].rank = i + 1;
			std[i].toPrint();
		}
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
