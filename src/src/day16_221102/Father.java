package day16_221102;

public class Father extends Grand{
	public int money = 100; 
	public void abc() {
		System.out.println("나는 아버지 클래스");
	}
	public void xyz() {
		System.out.println("우영씨에게 돈벌어오라고 시킵니다.");
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
