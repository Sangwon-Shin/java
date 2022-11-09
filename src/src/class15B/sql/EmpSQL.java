package class15B.sql;

public class EmpSQL {
	public final int SEL_NAME_LIST			=		1001;
	public final int SEL_NAME_INFO			=		1002;
	public final int SEL_DNO_LIST			=		1003;
	public final int SEL_DNO_MEMBER_LIST	=		1004;
	public final int SEL_EMP_LIST			=		1005;
	public final int SEL_TOTAL				=		1006;
	public final int SEL_NAME_LESS_INFO		=		1007;
	
	public final int EDIT_ENO_SAL			=		2001;
	public final int EDIT_MNO_SAL			=		2002;
	
	public final int ADD_EMP				=		3001;
	
	//public final int DEL_EMP				=		4001;
	
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case SEL_NAME_LIST:
			buff.append("SELECT ");
			buff.append("	ename ");
			buff.append("FROM ");
			buff.append("	emp1 ");
			break;
		case SEL_NAME_INFO:
			// 사원들의 사원번호, 사원이름, 직급, 상사이름, 
			//	입사일, 급여, 급여등급, 커미션, 부서이름 조회
			buff.append("SELECT ");
			buff.append("	e.empno mno, e.ename name, e.job, s.ename sname, e.hiredate hdate, e.sal, NVL(grade, -1) grade, e.comm, dname ");
			buff.append("FROM ");
			buff.append("	emp1 e, emp1 s, salgrade, dept d ");
			buff.append("WHERE ");
			buff.append("	e.deptno = d.deptno ");
			buff.append("	AND e.mgr = s.empno(+) ");
			buff.append("	AND e.sal BETWEEN losal(+) AND hisal(+) ");
			buff.append("	AND e.ename = ? ");
			break;
		case SEL_DNO_LIST:
			buff.append("SELECT ");
			buff.append("	deptno dno ");
			buff.append("FROM ");
			buff.append("	dept ");
			break;
		case SEL_DNO_MEMBER_LIST:
			buff.append("SELECT ");
			buff.append("	empno mno, ename name, job, sal ");
			buff.append("FROM ");
			buff.append("	emp1 ");
			buff.append("WHERE ");
			buff.append("	deptno = ? ");
			break;
		case ADD_EMP:
			buff.append("INSERT INTO ");
			buff.append("	emp1 ");
			buff.append("VALUES( ");
			buff.append("	(SELECT NVL(MAX(empno) + 1, 1001) FROM emp1), ");
			buff.append("	?, ?, ");
			buff.append("	(SELECT empno FROM emp1 WHERE ename = ?), ");
			buff.append("	TO_DATE(TO_CHAR(SYSDATE,'YYYY/MM/DD')), ");
			buff.append("	?, ?, ");
			buff.append("	(SELECT deptno FROM emp1 WHERE ename = ?), ");
			buff.append("	? ");
			buff.append(") ");
			break;
		case EDIT_ENO_SAL:
			buff.append("UPDATE ");
			buff.append("	emp1 ");
			buff.append("SET ");
			buff.append("	sal = ? ");
			buff.append("WHERE ");
			buff.append("	ename = ? ");
			break;
		case SEL_NAME_LESS_INFO:
			buff.append("SELECT ");
			buff.append("	empno mno, ename name, sal, hiredate hdate, deptno dno ");
			buff.append("FROM ");
			buff.append("	emp1 ");
			buff.append("WHERE ");
			buff.append("	ename = ? ");
			break;
		case EDIT_MNO_SAL:
			buff.append("UPDATE ");
			buff.append("	emp1 ");
			buff.append("SET ");
			buff.append("	sal = ? ");
			buff.append("WHERE ");
			buff.append("	empno = ? ");
			break;
		case SEL_EMP_LIST:
			buff.append("SELECT ");
			buff.append("    rno, mno, name, hdate, dno ");
			buff.append("FROM ");
			buff.append("    ( ");
			buff.append("        SELECT ");
			buff.append("            rownum rno, mno, name, hdate, dno ");
			buff.append("        FROM( ");
			buff.append("                SELECT ");
			buff.append("                    empno mno, ename name, hiredate hdate, deptno dno ");
			buff.append("                FROM ");
			buff.append("                    emp1 ");
			buff.append("                ORDER BY ");
			buff.append("                    empno ");
			buff.append("            ) ");
			buff.append("    )     ");
			buff.append("WHERE ");
			buff.append("    rno BETWEEN ? AND ? ");
			break;
		case SEL_TOTAL:
			buff.append("SELECT ");
			buff.append("    COUNT(*) cnt ");
			buff.append("FROM ");
			buff.append("    emp1 ");
			break;
			
		}
		
		
		// 쿼리 반환
		return buff.toString();
		
	}
}
