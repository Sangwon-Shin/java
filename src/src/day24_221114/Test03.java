package day24_221114;
import java.util.regex.*;
public class Test03 {
//특정 문자열을 입력한 후 그 문자열 중에서 원하는 규칙에 맞는 부분만 골라서 출력
	public Test03() {
		String tel = "전화번호: 010-1111-2222";
		// tel 문자열에서 전화번호만 꺼내고 싶다면
		// 1. 정규표현식 패턴 만들기
		Pattern form = Pattern.compile("0[0-9]{1,2}-[0-9]{3,4}-[0-9]{4}");
		// 2. 검사결과 객체(Matcher 객체) 만들기
		Matcher mat = form.matcher(tel); 
		// 3. find() 이용해서 규칙에 맞는 부분이 있는지 확인
		//String result0;	← 필드가 아니라 변수이므로 자동초기화 안돼서 에러
		//String result1 = null;	← 이렇게 null 로 초기화를 직접 해줘야 한다.
		String result = "";
		if(mat.find()) {
			// 4. 맞는 부분이 있다면 꺼낸다
			result = mat.group();
		}
		System.out.println("result: " + result);
	}

	public static void main(String[] args) {
		new Test03();
	}

}
