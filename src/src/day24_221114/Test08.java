package day24_221114;
import java.text.*;
public class Test08 {

	public Test08() {
		/*
		  	문자열을
		  		"이름: 제니, 전화: 010-1111-1111, 나이: 27"
		  	의 형식으로 만들어서 사용하고 싶다.
		 */
		String pattern = "이름: {0}, 전화: {1}, 나이: {2}";
		MessageFormat form = new MessageFormat(pattern);
		// 입력순서대로 배열에 채워준다. 데이터타입이 하나가 아니기 때문에 Object[]
		Object[] data = {"제니", "010-1111-1111", 27};
		String result = form.format(data);
		System.out.println(result);
		
		Object[] obj = null;
		try {
			obj = form.parse(result);	// pattern 에 따라 데이터를 배열로 추출
			for(Object o : obj) {
				System.out.println(o);
			}
		} catch(Exception e) {}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
