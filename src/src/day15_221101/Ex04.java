/*
 		게시글 하나의 정보를 기억할 수 있는 Board 클래스를 제작하고
 		데이터를 세팅하고
 		꺼내서 출력해보세요.
 		배열에 5개의 글을 담아서 출력해보세요.
 */

package day15_221101;

import java.sql.Date;

public class Ex04 {

	public Ex04() {
		int npost = 5;
		int[] cate = {1, 1, 2, 2, 0};
		String[] titles = {"DB 너무 재밌네요", "DB 어려운데요",
							"자바 못해먹겠어요", "이중 for문 누가만듦?",
							"HTML 재밌는건 저뿐인가요?"};
		String[] bodies = {
				"질의문 하나만 완성하면 원하는걸 보여주니까 성공했다는 느낌이 자주 들어서 재밌네요",
				"DB는 왜 변수가 없나요? SQL문이 귀찮은건 다 변수가 없어서인 것 같네요",
				"인스턴스가 있는데 클래스는 왜 따로 있는건가요? 접근지정자는 왜 있는건가요?",
				"어떤 문제는 for 문 세개도 겹치던데 아 탈주하고싶다",
				"글들 보니깐 저만 HTML 하고 있는거 같네요 ㅠㅠ SQL 자바 아직 모르겠어용"};
		String[] writers = {"보나","성소", "은서", "다영", "루다", "설아", "여름",
				"엑시", "수빈", "다원", "연정", "선의", "미기"};
		Board[] posts = new Board[npost];
		for(int i = 0; i < npost; i++) {
			int wcount = (int)(Math.random() * 100);
			Date wdate = Date.valueOf("2022-11-01");
			posts[i] = new Board(i+1,wcount,cate[i],titles[i],bodies[i],writers[i],wdate); 
			posts[i].toPrint();
		}
		
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
