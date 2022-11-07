package day19_221107;
import java.util.*;
public class Test04 {
	private ArrayList<String> names;
	private ArrayList<PinkScore> blackpink; 
	
	public Test04() {
		blackpink = new ArrayList<PinkScore>();
		names = new ArrayList<String>();
		names.add("jennie");
		names.add("lisa");
		names.add("rose");
		names.add("jisoo");
		
		for(int i = 0; i < 4; i++) {
			int kor = (int)(Math.random() * 41 + 60);
			int eng = (int)(Math.random() * 41 + 60);
			int math = (int)(Math.random() * 41 + 60);
			
			String name = names.get(i);
			PinkScore score = new PinkScore(name, kor, eng, math);
			blackpink.add(score);
		}
		// 총점 내림차순 정렬
		System.out.println("총점 내림차순 정렬 ---------");
		Collections.sort(blackpink, new AlignDesc());
		// 출력
		printScore(blackpink);
		
		// 국어점수 내림차순 정렬
		//System.out.println("B".compareTo("BC"));
		System.out.println("\n국어점수 내림차순 정렬 ---------");
		Collections.sort(blackpink, new AlignDesc("kor"));
		printScore(blackpink);
		
		// 이름순 내림차순 정렬
		System.out.println("\n이름 내림차순 정렬 ---------");
		Collections.sort(blackpink, new AlignDesc("name"));
		printScore(blackpink);
		
		
	}

	public static void main(String[] args) {
		new Test04();
	}
	
	public void printScore(ArrayList<PinkScore> blackpink) {
		for(PinkScore p : blackpink) {
			String name = p.getName();
			int kor = p.getKor();
			int eng = p.getEng();
			int math = p.getMath();
			int total = p.getTotal();
			double avg = p.getAvg();
			System.out.printf("%-8s : k - %3d, e - %3d, m - %3d, t - %4d, avg - %5.2f\n",
					name, kor, eng, math, total, avg);
		}
	}
}

// 내림차순 정렬해주는 클래스
class AlignDesc implements Comparator {
	int subj = 4;
	public AlignDesc() {}
	public AlignDesc(String subj){
		switch(subj.toLowerCase()) {
		case "kor":
			this.subj = 1;
			break;
		case "eng":
			this.subj = 2;
			break;
		case "math":
			this.subj = 3;
			break;
		case "name":
			this.subj = 5;
			break;
		}
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		int no1 = 0;
		int no2 = 0;
		int result = 0;
		switch(subj){
		case 1:
			no1 = ((PinkScore) o1).getKor();
			no2 = ((PinkScore) o2).getKor();
			break;
		case 2:
			no1 = ((PinkScore) o1).getEng();
			no2 = ((PinkScore) o2).getEng();
			break;
		case 3:
			no1 = ((PinkScore) o1).getMath();
			no2 = ((PinkScore) o2).getMath();
			break;
		case 4:
			no1 = ((PinkScore) o1).getTotal();
			no2 = ((PinkScore) o2).getTotal();
			break;
		case 5:
			String name1 = ((PinkScore) o1).getName();
			String name2 = ((PinkScore) o2).getName();
			no2 = name2.compareTo(name1);
		}
		result = no2 - no1;
		return result;
	}
		
}
	
