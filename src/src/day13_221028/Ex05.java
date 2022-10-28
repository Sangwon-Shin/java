/*
 	10명의 학생의 국어, 영어, 수학 점수를 랜덤하게 세팅해서
 	총점, 평균, 석차를 계산해서 출력해주는 프로그램을 작성하세요
 	각 기능은 모두 별도의 함수로 작성하고 배열은 [10][6] 크기로 만드세요.
 */

package day13_221028;

public class Ex05 {

	public Ex05() {
		toPrint(fillRanks(fillAggs(fillScore(10, 3))));
	}

	public static void main(String[] args) {
		new Ex05();
	}

	public double[][] fillScore(int nstd, int nsbj) {
		double[][] score = new double[nstd][nsbj + 3];
		for (int i = 0; i < nstd; i++) {
			for (int j = 0; j < nsbj; j++) {
				score[i][j] = (int) (Math.random() * 41 + 60);
			}
		}
		return score;
	}

	public double[][] fillAggs(double[][] score) {
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			score[i][3] = sum;
			score[i][4] = Math.round(sum * 100 / (score[i].length - 3)) / 100.;
		}
		return score;
	}

	public double[][] fillRanks(double[][] score) {
		for (int i = 0; i < score.length; i++) {
			int rank = 1;
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] < score[j][3]) {
					rank += 1;
				}
			}
			score[i][5] = rank;
		}
		return score;
	}

	public void toPrint(double[][] score) {
		System.out.println("랜덤하게 생성한 학생 점수:\n");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d 번 학생의 \n", i + 1);
			System.out.printf("국어점수: %3.0f, 영어점수: %4.0f, 수학점수: %3.0f"
					+ "\n    총점: %3.0f,     평균: %2.1f,     석차: %3.0f\n",score[i][0],score[i][1],score[i][2],score[i][3],score[i][4],score[i][5]);
			System.out.println();
		}
	}
}
