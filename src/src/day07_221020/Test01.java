package day07_221020;

/*
	잘못된 switch ~ case 사용 예
 */

public class Test01 {

	public static void main(String[] args) {
		// 랜덤하게 정수 발생
		int no = (int)(Math.random()*10);
		
		// 결과값 변수 
		String result = "";
		
		// switch ~ case 처리
		switch(no) {
		case	0:
			System.out.println(no);
			result = "영";
			break;
		case	1:
			System.out.println(no);
			result = "하나";
			break;
		case	2:
			System.out.println(no);
			result = "둘";
			break;
		case	3:
			System.out.println(no);
			result = "셋";
		case	4:
			System.out.println(no);
			result = "넷";
		case	5:
			System.out.println(no);
			result = "다섯";
		case	6:
			System.out.println(no);
			result = "여섯";
		case	7:
			System.out.println(no);
			result = "일곱";
		case	8:
			System.out.println(no);
			result = "여덟";
		case	9:
			System.out.println(no);
			result = "아홉";
		}
		System.out.println("입력된 정수는 [ " + no + " ] 이고 [ "+ result + " ] 입니다.");
	}

}
