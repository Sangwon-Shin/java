package class15B.sql;

public class EmpSQL {
	public final int SEL_NAME_LIST		=		1001;
	public final int SEL_NAME_INFO		=		1002;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case SEL_NAME_LIST:
			buff.append("SELECT ");
			buff.append("	ename ");
			buff.append("FROM ");
			buff.append("	emp ");
			break;
		case SEL_NAME_INFO:
// 사원들의 사원번호, 사원이름, 직급, 상사이름, 
//	입사일, 급여, 급여등급, 커미션, 부서이름 조회
			buff.append("SELECT ");
			buff.append("	e.empno mno, e.ename name, e.job, s.ename sname, e.hiredate hdate, e.sal, grade, e.comm, dname ");
			buff.append("FROM ");
			buff.append("	emp e, emp s, salgrade, dept d ");
			buff.append("WHERE ");
			buff.append("	e.deptno = d.deptno ");
			buff.append("	AND e.mgr = s.empno(+) ");
			buff.append("	AND e.sal BETWEEN losal AND hisal ");
			buff.append("	AND e.ename = ? ");
			break;
		}
		
		// 쿼리 반환
		return buff.toString();
		
	}
}
