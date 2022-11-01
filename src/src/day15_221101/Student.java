package day15_221101;

public class Student {
	private String name;
	private int java, db, web, sum, rank;
	private double avg;

	public Student() {
		
	}
	
	public Student(String name, int java, int db, int web) {
		setData(name, java, db, web);
		calcAgg();
	}
	
	public void setData(String name, int java, int db, int web) {
		this.name = name;
		this.java = java;
		this.db = db;
		this.web = web;
	}
	
	public void calcAgg() {
		sum = java + db + web;
		avg = sum / 3.;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getRank() {
		return rank;
	}
	
	public void setRank(Student other) {
		if(this.getSum() < other.getSum()) {
			setRank(getRank() + 1);
		}
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
