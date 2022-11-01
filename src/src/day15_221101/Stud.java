package day15_221101;

public class Stud {
	private String name;
	private int ban, no, kor, eng, math, total, rank;
	private double avg;

	public Stud(int ban, int no, String name) {
		setBan(ban);
		setNo(no);
		setName(name);
	}

	public Stud(int ban, int no, String name, int kor, int eng, int math) {
		setBan(ban);
		setNo(no);
		setName(name);
		setKor(kor);
		setEng(eng);
		setMath(math);
		setTotal(kor, eng, math);
		setAvg(kor, eng, math);
	}

	public Stud(int ban, int no, int kor, int eng, int math) {
		setBan(ban);
		setNo(no);
		setKor(kor);
		setEng(eng);
		setMath(math);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int ... num) {
		int tot = 0;
		for(int i = 0; i < num.length; i++) {
			tot += num[i];
		}
		this.total = tot;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(Stud other) {
		if(this.getTotal() < other.getTotal()) {
			setRank(getRank() + 1);
		}
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getAvg() {
		return Math.round(avg * 10) / 10.;
	}

	public void setAvg(int ... num) {
		this.avg = getTotal() / 3.;
	}
	public void toPrint() {
		System.out.printf("반: %d | 번호: %d | 이름: %s\n국어점수: %d |"
				+" 영어점수: %d | 수학점수: %d\n총점: %d | 평균: %3.1f | 순위: %d\n\n",
				ban, no, name, kor, eng, math, getTotal(), getAvg(), rank);
	}
}
