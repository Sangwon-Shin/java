package class15B.dao;

import java.util.*;
import java.util.Date;
import java.sql.*;
import class15B.sql.*;
import class15B.util.PageUtil;
import class15B.vo.*;
import class15B.db.*;

/**
 * 이 클래스는 사원정보 데이터베이스 작업 전담 처리 클래스
 * 
 * @author 신상원
 * @since 2022/11/07
 */
public class EmpDao {
	/*
	 * 이 클래스가 new 되는 경우는 emp 테이블에 접근해서 데이터베이스 작업이 필요한 경우이다. 따라서 이 클래스가 new 되는 순간
	 * oracle 을 사용할 준비가 끝나있어야 한다.
	 */
	private SmartJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private EmpSQL eSQL;

	public EmpDao() {
		db = new SmartJDBC();
		eSQL = new EmpSQL();
	}

	// 사원이름리스트 조회 전담 처리함수
	public ArrayList getNameList() {
		// 작업순서
		// 0. 반환값 변수 만들고
		ArrayList list = new ArrayList();
		// 1. 커넥션 꺼내오고
		con = db.getCon("scott", "tiger");
		// 2. 질의명령 가져오고
		String sql = eSQL.getSQL(eSQL.SEL_NAME_LIST);
		// 3. 명령전달도구 준비하고
		stmt = db.getStmt(con);
		// 필요한 쿼리가, 채워야할 데이터가 없는 완성된 쿼리이므로
		// 쿼리 완성 작업은 하지 않는다.
		try {
			// 4. 질의명령 보내고 결과 받고
			rs = stmt.executeQuery(sql); // stmt: 쿼리 실어서 보내는 도구
			// 5. 조회결과에서 데이터 꺼내고
			// 만들어진 inline 테이블이 여러행이므로 반복처리하면 된다.
			while (rs.next()) {
				/*
				 * rs.next() ← ResultSet 이 기억하고 있는 인라인테이블의 가상레코드포인트가 BOF 에 있는데 그것을 한 행 밑으로 내려주는
				 * 명령 반환값은, 꺼낼 데이터가 있으면 true, 없으면 false EOF 로 이동하는 순간 false 반환
				 */
				// 조건식에서 rs.next() 레코드포인터를 데이터를 꺼내올 행으로
				// 이동시켰으니, 데이터를 꺼내서 처리해주면 된다.
				// 지금의 경우 사원들의 이름들만 조회를 하고 있으니 한 가지 타입의
				// 한개의 데이터가 여러 행 조회된다.
				// 따라서 문자열을 꺼낸 후 리스트에 채워주면 된다.
				String name = rs.getString("ename");// 인덱스로 꺼내면 순서확인 번거롭다
				list.add(name);
			}
			// 6. 꺼낸 데이터 ArrayList 에 채우고
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con); // 안닫으면 나중에 열린 커넥션이 많아져서 한계수에 도달
		}
		// 7. ArrayList 반환해주고
		return list;
	}

	// 사원이름을 전달받아서 사원 정보 조회 전담 처리함수
	public EmpVO getNameInfo(String name) {
		// 0. 반환값 변수 만들고
		EmpVO eVO = new EmpVO();
		// 1. 커넥션 얻어오고
		con = db.getCon("scott", "tiger");
		// 2. 질의명령 가져오고
		String sql = eSQL.getSQL(eSQL.SEL_NAME_INFO);
		// 3. 명령전달도구 꺼내오고
		pstmt = db.getPstmt(con, sql);
		try {
			// 4. 질의명령 완성하고
			pstmt.setString(1, name);
			// 5. 질의명령 보내고 결과받고
			rs = pstmt.executeQuery();
			// 6. 결과 꺼내서 VO 에 담고
			rs.next(); // 레코드포인터 한 행 내리고
			int mno = rs.getInt("mno");
			String ename = rs.getString("name");
			String job = rs.getString("job");
			String sname = rs.getString("sname");
			int sal = rs.getInt("sal");
			int grade = rs.getInt("grade");
			int comm = rs.getInt("comm");
			String dname = rs.getString("dname");
			Date hdate = rs.getDate("hdate");

			eVO.setMno(mno);
			eVO.setName(ename);
			eVO.setJob(job);
			eVO.setSname(sname);
			eVO.setSal(sal);
			eVO.setGrade(grade);
			eVO.setComm(comm);
			eVO.setDname(dname);
			eVO.setHdate(hdate);
			eVO.setSdate();
			// VO 에 받아온 데이터를 채우는 작업이 완료됨.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		// 7. VO 반환해주고
		return eVO;
	}

	// 부서번호 조회 전담 처리함수
	public ArrayList<Integer> getDnoList() {
		// 1. 반환값 변수 만들고
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 2. 커넥션 얻어오고
		con = db.getCon("scott", "tiger");
		// 3. 질의명령 가져오고
		String sql = eSQL.getSQL(eSQL.SEL_DNO_LIST);
		// 4. 명령전달도구 꺼내오고
		stmt = db.getStmt(con);
		// 5. 질의명령 완성 → 이 기능에서 필요한 쿼리는 완성된 쿼리이므로 생략
		try {
			// 6. 질의명령 보내고 결과 받고
			rs = stmt.executeQuery(sql);
			// 7. 꺼내서 리스트에 담고
			while (rs.next()) {
				int dno = rs.getInt("dno");
				list.add(dno);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}

		// 8. 리스트 반환해주고
		return list;
	}

	// 부서번호를 전달받아서 부서원정보 조회하는 함수
	public ArrayList<EmpVO> getDnoMemberList(int dno) {
		// 1. 반환값 변수 만들고
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		// 2. 커넥션 꺼내오고
		con = db.getCon("scott", "tiger");
		// 3. 쿼리 가져오고
		String sql = eSQL.getSQL(eSQL.SEL_DNO_MEMBER_LIST);
		// 4. 쿼리 전달 도구 꺼내오고
		pstmt = db.getPstmt(con, sql);
		try {
			// 5. 쿼리 완성
			pstmt.setInt(1, dno); // 첫번째 물음표에 dno 채움
			// 6. 쿼리 보내고 결과 받고
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// 7. 반복해서 꺼내서 VO에 담고
				EmpVO eVO = new EmpVO();
				int mno = rs.getInt("mno");
				String name = rs.getString("name");
				String job = rs.getString("job");
				int sal = rs.getInt("sal");
				eVO.setMno(mno);
				eVO.setName(name);
				eVO.setJob(job);
				eVO.setSal(sal);
				// 8. 리스트에 VO 담고
				list.add(eVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		// 9. 리스트 반환
		return list;
	}

	// 사원 정보 추가 함수
	public int addEmp(EmpVO eVO) {
		// 0. 반환값 변수 만들기
		int cnt = -1;
		// 1. 커넥션 꺼내오고
		con = db.getCon("scott", "tiger");
		// 2. 쿼리 꺼내오고
		String sql = eSQL.getSQL(eSQL.ADD_EMP);
		// 3. 명령 전달 도구 가져오고
		pstmt = db.getPstmt(con, sql);
		try {
			// 4. 쿼리 완성
			pstmt.setString(1, eVO.getName());
			pstmt.setString(2, eVO.getJob());
			pstmt.setString(3, eVO.getSname());
			pstmt.setInt(4, eVO.getSal());
			pstmt.setInt(5, eVO.getComm());
			pstmt.setString(6, eVO.getSname());
			pstmt.setString(7, eVO.getMail());
			// 5. 쿼리 보내고 결과 받고
			cnt = pstmt.executeUpdate(); // 삽입, 수정, 삭제 쿼리 처리함수
			// INSERT 쿼리가 성공하면 1, 실패하면 0 반환
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		// 6. 반환값 내보내고
		return cnt;
	}

	// 사원이름과 급여를 입력받아서 수정해주는 함수
	public int editNameSal(String name, int sal) {
		int cnt = 0;
		// 1. 커넥션 가져오고
		con = db.getCon("scott", "tiger");
		// 2. 쿼리 가져오고
		String sql = eSQL.getSQL(eSQL.EDIT_ENO_SAL);
		// 3. 명령문 가져오고
		pstmt = db.getPstmt(con, sql);
		try {
			// 4. 쿼리 완성하고
			pstmt.setInt(1, sal);
			pstmt.setString(2, name);
			// 5. 쿼리 보내고 결과 받고
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		// 6. 결과 반환해주고
		return cnt;
	}

	// HW 사원번호와 급여를 입력받아서 수정해주는 함수
	public int editMnoSal(int mno, int sal) {
		int cnt = 0;
		// 1. 커넥션 가져오고
		con = db.getCon("scott", "tiger");
		// 2. 쿼리 가져오고
		String sql = eSQL.getSQL(eSQL.EDIT_MNO_SAL);
		// 3. 명령문 가져오고
		pstmt = db.getPstmt(con, sql);
		try {
			// 4. 쿼리 완성하고
			pstmt.setInt(1, sal);
			pstmt.setInt(2, mno);
			// 5. 쿼리 보내고 결과 받고
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		// 6. 결과 반환해주고
		return cnt;
	}

	// 사원이름을 입력받아서 사원번호, 사원이름, 급여, 입사일, 부서번호를 꺼내는 함수
	public EmpVO getNameLessInfo(String name) {
		// 0. 반환값 변수 만들고
		EmpVO eVO = new EmpVO();
		// 1. 커넥션 얻어오고
		con = db.getCon("scott", "tiger");
		// 2. 질의명령 가져오고
		String sql = eSQL.getSQL(eSQL.SEL_NAME_LESS_INFO);
		// 3. 명령전달도구 꺼내오고
		pstmt = db.getPstmt(con, sql);
		try {
			// 4. 질의명령 완성하고
			pstmt.setString(1, name);
			// 5. 질의명령 보내고 결과받고
			rs = pstmt.executeQuery();
			// 6. 결과 꺼내서 VO 에 담고
			rs.next(); // 레코드포인터 한 행 내리고
			int mno = rs.getInt("mno");
			String ename = rs.getString("name");
			int sal = rs.getInt("sal");
			Date hdate = rs.getDate("hdate");
			int dno = rs.getInt("dno");

			eVO.setMno(mno);
			eVO.setName(ename);
			eVO.setSal(sal);
			eVO.setHdate(hdate);
			eVO.setDno(dno);
			// VO 에 받아온 데이터를 채우는 작업이 완료됨.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		// 7. VO 반환해주고
		return eVO;
	}

	// 총 사원수 조회 함수
	public int getTotal() {
		// 할 일
		// 1. 반환값 변수 설정
		int cnt = 0;
		// 2. 커넥션 꺼내오고
		con = db.getCon("scott", "tiger");
		// 3. 쿼리 가져오고
		String sql = eSQL.getSQL(eSQL.SEL_TOTAL);
		// 4. 명령전달도구 준비하고
		stmt = db.getStmt(con);
		try {
			// 5. 쿼리 완성(불필요)
			// 6. 쿼리 전달하고 결과 받고
			rs = stmt.executeQuery(sql);
			// 7. 데이터 꺼내고
			rs.next();
			cnt = rs.getInt("cnt");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		// 8. 반환
		return cnt;
	}

	// 사원리스트 조회 전담 처리함수
	public ArrayList<EmpVO> getEmpList(PageUtil page) {
		// 1. 반환값 변수
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		// 2. 커넥션 꺼내오고
		con = db.getCon("scott", "tiger");
		// 3. 쿼리 가져오고
		String sql = eSQL.getSQL(eSQL.SEL_EMP_LIST);
		// 4. 명령전달도구 준비
		pstmt = db.getPstmt(con, sql);
		try {
			// 5. 쿼리 완성
			pstmt.setInt(1, page.getStartRno());
			pstmt.setInt(2, page.getEndRno());
			// 6. 쿼리 보내고 결과 받고
			rs = pstmt.executeQuery();
			// 7. 결과 꺼내서 VO에 담고
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
			// 8. List 에 VO 담고
				//int rno = rs.getInt("rno");
				int mno = rs.getInt("mno");
				int dno = rs.getInt("dno");
				String name = rs.getString("name");
				Date hdate = rs.getDate("hdate");
				eVO.setMno(mno);
				eVO.setDno(dno);
				eVO.setName(name);
				eVO.setHdate(hdate);
				eVO.setSdate();
				list.add(eVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}

		// 9. 리스트 반환해주고
		return list;
	}
}
