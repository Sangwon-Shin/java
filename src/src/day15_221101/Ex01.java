/*
 	1.	다음 변수를 가지는 Stud 클래스를 만드세요
 		String name;
 		int ban, no, kor, eng, math, total, rank;
 		double avg;
 	
 	2.	생성자를 정의하세요.
 		(1) 반, 번호, 이름을 알려주면 객체를 만들 수 있는 생성자.
 		(2) 반, 번호, 이름, 3과목 점수를 알려주면 객체를 만들 수 있는 생성자.
 		(3) 반, 번호, 세 과목 점수를 배열로 알려주면 객체를 생성하는 생성자.
 		
 	 3. 위 클래스에 다음 기능을 가지는 함수를 추가하세요
 	 	(1) 총점을 반환해주는 getTotal()
 	 	(2) 평균을 반환해주는 getAvg()
 	 		단, 평균은 소수점 이하 둘째 자리에서 반올림해서 반환
 	 	(3) 반, 번호, 이름, 세 과목 점수, 총점, 평균, 순위를 출력해주는 함수 toPrint()
 	 	(4) 순위를 계산해주는 함수 setRank()
 
 
 */


package day15_221101;

public class Ex01 {
	String[] woojoo = {"보나","성소", "은서", "다영", "루다", "설아", "여름",
						"엑시", "수빈", "다원", "연정", "선의", "미기"};
	int nBan = 10;
	Stud[] stds;
	int[] nBanStds = new int[nBan]; 
	public Ex01() {
		int totStds = 0;
		for(int i = 0; i < nBan; i++) {
			int rnum = (int)(Math.random() * 9 + 5);
			totStds += rnum;
			nBanStds[i] = rnum;
		}
		stds = new Stud[totStds];
		int nPstd = 0;
		for(int i = 0; i < nBan; i++) {
			for(int j = 0; j < nBanStds[i]; j++) {
				int kor = (int)(Math.random() * 41 + 60);
				int eng = (int)(Math.random() * 41 + 60);
				int math = (int)(Math.random() * 41 + 60);
				stds[nPstd++] = new Stud(i+1, j+1, woojoo[j], kor, eng, math);
			}
		}
		
		// 순위 매기기
		for(int i = 0; i < totStds; i++) {
			stds[i].setRank(1);
			for(int j = 0; j < totStds; j++) {
				stds[i].setRank(stds[j]);
			}
		}
		
		// 출력
		for(int i = 0; i < totStds; i++) {
			stds[i].toPrint();
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
