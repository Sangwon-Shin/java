
/*
 *  문제 1]
 *  String[] student = {"제니", "리사", "로제", "지수"};
 *  int[] java = {100, 80, 90, 95};
 *  int[] db = {90, 95, 80, 80};
 *  int[] web = {80, 80, 95, 100};
 *  이차원 배열 score에 점수를 학생별로 배열시키세요.
 */
import java.util.*;

class Ex01 {
    public static void main(String[] args) {
        String[] student = { "제니", "리사", "로제", "지수" };
        int[] java = { 100, 80, 90, 95 };
        int[] db = { 90, 95, 80, 80 };
        int[] web = { 80, 80, 95, 100 };

        int nom = student.length; // number of members
        String[][] score = new String[nom][nom];
        for (int i = 0; i < 4; i++) {
            score[i][0] = student[i];
            score[i][1] = java[i] + "";
            score[i][2] = db[i] + "";
            score[i][3] = web[i] + "";
        }
        System.out.println(Arrays.deepToString(score));

        int[] total = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                total[i] += Integer.parseInt(score[i][j]);
            }
        }
        System.out.println(Arrays.toString(total));

        // 과목별 학생들 점수 & 총점
        int nos = 3; // number of subjects
        int[][] score2 = new int[nos + 1][nom + 1];
        for (int j = 0; j < nom; j++) {
            for (int i = 0; i < nos; i++) {
                score2[i][j] = Integer.parseInt(score[j][i + 1]);
            }
        }
        int iSum;
        int jSum;
        for (int i = 0; i < nos + 1; i++) {
            jSum = 0;
            for (int j = 0; j < nom + 1; j++) {
                jSum += score2[i][j];
            }
            score2[i][nom] = jSum;
        }
        for (int j = 0; j < nom + 1; j++) {
            iSum = 0;
            for (int i = 0; i < nos + 1; i++) {
                iSum += score2[i][j];
            }
            score2[nos][j] = iSum;
        }
        System.out.println(Arrays.deepToString(score2));
/*
 향상된 for 명령(forEach)
 배열과 같은 시퀀스 자료형에서 사용할 수 있는 반복문
 배열에 기억된 데이터를 하나씩 꺼내서 앞에 선언한 변수 n에 순차적으로 대입해준다.
 문제점: 인덱스로 접근할 수 없다.
 for (int n : count) {
 }
 */

    }
}