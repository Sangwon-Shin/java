package day04;

public class Test01 {

	public static void main(String[] args) {
		// 큰 메모리가 작은 메모리로 참조되는 경우
		// int no1 = 3.14; error
		float no1 = 3.14F;
		System.out.println("no1: "+no1);
		float no2 = (float) 10.0;
		System.out.println("no2: "+no2);
		// 자동 형변환
		double no3 = 10.0f;
		System.out.println("no3: "+no3);
		
		int no;
		// 위의 변수 선언의 의미는 사용할 데이터가 정수형이고 사용할 크기는 4바이트라는 것.
		 
		no = 100;
		// 대입연산자의 연산 방향은 오른쪽에서 왼쪽이다. 
		

	}

}
