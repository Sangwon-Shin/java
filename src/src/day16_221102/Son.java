package day16_221102;

public class Son extends Father {
	public int money = 1000;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void abc() {
		System.out.println("나는 아들 클래스");
	}
	public void xyz() {
		System.out.println("단풍이 들어서 놀러갑니다.");
	}
	public void toPlay() {
		System.out.println("밤의 여왕의 아리아를 듣습니다.");
	}
}
