package day11_221026;

public class Student {
	public String name;
	public int kor, eng, math, total, rank;
	public double avg;
	
	public void toPrint() {
		System.out.printf("순위: %d\n이름: %s\n국어: %d\n영어: "
				+ "%d\n수학: %d\n총점: %d\n평균: %5.2f\n\n", rank, name, kor, 
				eng, math, total, avg);
	}
}
