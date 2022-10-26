package day11_221026;

public class Ex03 {

	public Ex03() {
		// 학생 10명을 기억할 배열
		int arrLen = 10;
		int nSubj = 3;
		Student[] stud = new Student[arrLen];
		String[] names = { "제니", "리사", "로제", "지수", "아이유", "경욱", "태윤", "우영", "경민", "혁주" };

		// 10명의 국어점수를 기억할 배열을 만들고 점수를 랜덤하게 채우세요
		int[] korScore = new int[arrLen];
		for (int i = 0; i < arrLen; i++) {
			korScore[i] = (int) (Math.random() * 41 + 60);
		}
		// 10명의 영어점수를 기억할 배열을 만들고 점수를 랜덤하게 채우세요
		int[] engScore = new int[arrLen];
		for (int i = 0; i < arrLen; i++) {
			engScore[i] = (int) (Math.random() * 41 + 60);
		}

		// 10명의 수학점수를 기억할 배열을 만들고 점수를 랜덤하게 채우세요
		int[] mathScore = new int[arrLen];
		for (int i = 0; i < arrLen; i++) {
			mathScore[i] = (int) (Math.random() * 41 + 60);
		}

		// 10명의 총점을 기억할 배열을 만들고 채우세요
		int[] totalScore = new int[arrLen];
		for (int i = 0; i < arrLen; i++) {
			totalScore[i] = korScore[i] + engScore[i] + mathScore[i];
		}
		
		// 10명의 평균을 기억할 배열을 만들고 채우세요
		double[] avgScore = new double[arrLen];
		for (int i = 0; i<arrLen;i++) {
			avgScore[i] = (double) totalScore[i] / nSubj;
		}
		
		// 학생 배열에 각 데이터를 채우세요
		for(int i=0;i<arrLen;i++) {
			stud[i] = new Student();
			stud[i].name = names[i];
			stud[i].kor = korScore[i];
			stud[i].eng = engScore[i];
			stud[i].math = mathScore[i];
			stud[i].total = totalScore[i];
			stud[i].avg = avgScore[i];
		}
		// 학생배열의 데이터를 출력하세요
		for(int i=0; i<arrLen;i++) {
			stud[i].toPrint();
		}
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
