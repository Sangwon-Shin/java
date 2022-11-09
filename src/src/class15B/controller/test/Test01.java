/*
	컨트롤러 클래스
 */
package class15B.controller.test;
import class15B.dao.*;
import java.util.*;

import javax.swing.JOptionPane;
/*
	데이터베이스에서 꺼낸 데이터의 유형
		1. 한 개의 셀
			ex) select count(*) from emp
		2. 여러 개의 필드로 된 한 행
			ex) select * from emp where ename = 'SMITH';
		3. 하나의 필드의 여러 행
			ex) select ename from emp;
		4. 여러 필드가 여러 행
			ex) select * from emp;
			
	추가기능] 한 페이지에 4 명의 리스트가 보이도록.
 */
public class Test01 {
	private EmpDao eDao;
	private boolean bool = true;
	public Test01() {
		eDao = new EmpDao();
		EnameSearch eSrch =  new EnameSearch(this);
		//eSrch.satang();
		DnoSearch dSrch = new DnoSearch(this);
		//dSrch.satang();
		EditSal editSal = new EditSal(this);
		//editSal.satang();
		HashMap<String, Father> map = new HashMap<String, Father>();
		map.put("ename", eSrch);
		map.put("dno", dSrch);
		map.put("sal", editSal);
		map.put("elist", new EmpList(this));
		/* 키를 모르는 경우
		// map 의 키값들만 모두 추출해서 처리
		Set<String> keys = map.keySet();
		
		// 꺼내서 실행
		Iterator<String> itor = keys.iterator();
		while(itor.hasNext()) {
			String key = itor.next();
			Father f = map.get(key);
			f.satang();
		}
		*/
		
		// 키를 아는 경우
		while(bool) {
			String key = JOptionPane.showInputDialog("이름 검색: ename\n부서번호 검색: dno\n급여수정: sal\n리스트조회: elist\n\n종료: q");
			if(key.equals("q")) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				break;
			} else {
				map.get(key).satang();
			}
		}
		/*
		switch(key) {
		case "ename":
			map.get(key).satang();
			break;
		case "dno":
			map.get(key).satang();
			break;
		case "sal":
			map.get(key).satang();
			break;
		case "q":
			
			break;
		}
		*/
		
	}

	public EmpDao geteDao() {
		return eDao;
	}

	public void seteDao(EmpDao eDao) {
		this.eDao = eDao;
	}

	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public static void main(String[] args) {
		new Test01();
	}

}
