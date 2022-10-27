/*
 
 6개 반 학생들의 점수를 기억할 배열을 만들고
 각 반별로 랜덤하게 12 ~ 25명의 학생을 채우고
 학생별로 3 과목 점수를 랜덤하게 60 ~ 100 사이로 채워넣고
 출력  

 각 학생별 총점을 구하고
 각 반별 총점, 반 평균을 구해서 출력
 
 */

package day12_221027;

public class Extra {

	public Extra() {
		// 점수 채우기
		int noc = 6; // number of classes
		int nsbj = 3; // number of subjects
		int[][][] score = new int[noc][][];
		for (int i = 0; i < noc; i++) {
			int nstd = (int) (Math.random() * 14 + 12); // number of students in a class
			System.out.print("\n" + (i + 1) + "반 학생 수: " + nstd + "\n");
			score[i] = new int[nstd][nsbj];
			for (int j = 0; j < nstd; j++) {
				System.out.print((j + 1) + "번 학생의 세 과목 점수: ");
				for (int k = 0; k < nsbj; k++) {
					score[i][j][k] = (int) (Math.random() * 41 + 60);
					System.out.print(score[i][j][k] + ", ");
				}
				System.out.println();

			}
		}

		// 학생별 총점
		for (int i = 0; i < noc; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print((i + 1) + "반 " + (j + 1) + "번 학생의 총점: ");
				int sum = 0;
				for (int k = 0; k < nsbj; k++) {
					sum += score[i][j][k];
				}
				System.out.println(sum);
			}
			System.out.println();
		}

		// 반별 총점, 평균
		for (int i = 0; i < noc; i++) {
			for (int k = 0; k < nsbj; k++) {
				int sum = 0;
				for (int j = 0; j < score[i].length; j++) {
					sum += score[i][j][k];
				}
				System.out.print((i + 1) + "반 " + (k + 1) + "번째 과목의 총점: ");
				System.out.print(sum + "\t");
				double avg = Math.floor((double) sum / score[i].length * 100)/100;
				System.out.print("평균: " + avg + "\n"); 
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Extra();
	}

}
