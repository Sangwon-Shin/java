package day15_221101;

public class Test04 {
	int cnt;
	public Test04() {
		// 랜덤하게 cnt 를 만든다.
		cnt = (int)(Math.random() * 10 + 1);
		Member m = new Member();
		m.setArr(this);	// 여기서 this 가 된다는것은, 이 실행문들을 실행하기 전에
						// 인스턴스부터 만든다는 것을 뜻한다.
		int aCnt = m.getArr().length;
		System.out.println("cnt : " + cnt);
		System.out.println("m.arr.length : " + aCnt);
		// 두 값이 같게 나오는데, 
		// 코딩을 하다 보면 이런 식으로 둘 모두가 필요한 경우가 있다.
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}
