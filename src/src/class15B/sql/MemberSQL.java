package class15B.sql;

public class MemberSQL {
	// 질의명령들 코드 정의
	public final int SEL_ID_LIST	=	1001;
	// 아이디를 주면 그 아이디의 회원정보를 알려주는 질의명령
	public final int SEL_ID_INFO	=	1002;
	// 수정질의명령
	public final int EDIT_MAIL_ID 	=	2001;
	
	// 질의명령의 코드값을 입력받아서 해당 질의명령을 반환해주는 함수
	// String 클래스는 결합연산자 쓸때마다 새로운 인스턴스를 생성하기 때문에
	// 메모리 낭비가 심하다. 인스턴스를 하나만 쓰는게 StringBuffer
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		/*
		 	StringBuffer 사용방법
		 		1. new 시키고
		 		2. 변수.append(문자열);
		 		3. 변수.toString() 문자열로 변환 후 반환해준다.
		 */
		switch(code) {
		case SEL_ID_LIST:
			// 현재 활동중인 회원의 아이디를 조회하는 질의명령
			// 세미콜론 들어가면 에러 발생하는 것에 주의
			buff.append("SELECT ");	
			buff.append("	id ");// 마지막에 공백 반드시 있어야 idFrom 이 되지 않음.
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	isShow = 'Y' ");
			break;
		case EDIT_MAIL_ID:
			// ID, MAIL 을 알려주면 해당 아이디의 메일을 변경해주는 질의명령
			buff.append("UPDATE ");
			buff.append("	member ");
			buff.append("SET ");
			buff.append("	mail = ? ");
			// 변경돼야할 부분에는 물음표. 문자열이든 숫자든
			buff.append("WHERE ");
			buff.append("	id = ? ");
			break;
		case SEL_ID_INFO:
			
			
		}
		return buff.toString();
	}
}