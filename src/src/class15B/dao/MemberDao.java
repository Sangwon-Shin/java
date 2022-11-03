package class15B.dao;	// Data Access Object
import class15B.sql.*;
/**
 	회원관련 데이터베이스 작업 전담 처리 클래스
 	@author 	신상원
 	@since		2022/11/03
 	@version	v.0.1
 	
 			작업이력]
 				2022/11/03	-	담당자: 신상원
 								클래스 제작
 **/

/*
 	참고]
 		버전 숫자 규칙
 			Major.minor.micro
 		
 */
public class MemberDao {
	private MemberSQL mSQL;
	public MemberDao() {
		mSQL = new MemberSQL();
	}
	public String getIdList() {
		// 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_ID_LIST);
		
		return sql;
	}
}
