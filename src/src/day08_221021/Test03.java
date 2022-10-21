// Semo 클래스를 가져다 삼각형을 만들어보자. 
// 밑변과 높이는 랜덤하게 5 ~ 20 정수로. 

package day08_221021;

public class Test03 {

	public static void main(String[] args) {
		Semo s1 = new Semo();	
		/* Semo() 는 생성자 함수를 호출
		 * 매개변수에 데이터가 아무것도 입력되지 않는 형태의 생성자를
		 * 기본 생성자 라고 부르고
		 * 이 생성자는 제작한 클래스에 생성자가 정의되지 않았으면
		 * JVM 이 자동으로 만들어서 호출해준다. 
		 */
		System.out.println("밑변: " + s1.width);	// 기본형 멤버변수는 자동초기화
		// 밑변, 높이 세팅
		s1.width = (int)(Math.random() * 16 + 5);
		s1.height = (int)(Math.random() * 16 + 5);
		
		// 밑변, 높이 출력
		System.out.println("밑변: " + s1.width);
		System.out.println("높이: " + s1.height);
		
		// 넓이 세팅
		s1.setArea();
		// 넓이 출력
		System.out.println("넓이: " + s1.area);
		
		
		
	}

}
