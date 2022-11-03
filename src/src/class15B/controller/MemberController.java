package class15B.controller;
import class15B.dao.MemberDao;
public class MemberController {
	private MemberDao mDao;
	public MemberController() {
		mDao = new MemberDao();
		printIdList();
	}
	
	// 회원아이디 리스트 질의명령 출력
	public void printIdList() {
		// 질의명령 꺼내오고
		String sql = mDao.getIdList();
		// 꺼내온 질의명령 출력하고
		System.out.println("회원 아이디 리스트 조회 질의명령: \n" + sql);
	}

	public static void main(String[] args) {
		new MemberController();
	}

}
