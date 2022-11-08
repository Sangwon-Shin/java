/*
	사원들의 데이터베이스 작업을 컨트롤할 컨트롤러 클래스
 */
package class15B.controller;

import class15B.dao.*;
import class15B.vo.*;
import java.util.*;

import javax.swing.JOptionPane;

public class EmpController {
	private EmpDao eDao;
	private boolean bool = true;

	public EmpController() {
		eDao = new EmpDao();
		mainWin();
		/*
		 * // 회원 이름 리스트 조회 printNameList(); // 조회할 사원이름 입력받고 String name =
		 * JOptionPane.showInputDialog("조회할 사원이름").toUpperCase(); // 이름으로 사원정보 조회
		 * printNameInfo(name);
		 */
	}

	public void mainWin() {
		while (bool) {
			String sno = JOptionPane.showInputDialog("1. 사원이름으로 조회" 
						+ "\n2. 부서번호로 부서원 정보 조회" 
						+ "\n3. 사원 정보 입력"
						+ "\n4. 사원 급여 수정" 
						+ "\n5. 사원이름으로 간단 정보 조회"
						+ "\n# 번호를 입력하세요" 
						+ "\n종료하려면 q를 입력하세요");
			if (sno.equals("q")) {
				break;
			}
			switch (sno) {
			case "1":
				while (true) {
					// 회원 이름 리스트 조회
					printNameList();
					System.out.println();
					// 조회할 사원이름 입력받고
					String name = JOptionPane.showInputDialog("조회할 사원이름\n이전단계로 이동하려면 up을 입력하세요\n종료하려면 q를 입력하세요")
							.toLowerCase();
					if (name.equals("up")) {
						break;
					} else if (name.equals("q")) {
						bool = false;
						break;
					}
					// 이름으로 사원정보 조회
					printNameInfo(name);
				}
				break;
			case "2":
				getDnoMemberList();
				break;
			case "3":
				addEmp();
				break;
			case "4":
				editNameSal();
				break;
			case "5":
				while (true) {
					// 회원 이름 리스트 조회
					printNameList();
					System.out.println();
					// 조회할 사원이름 입력받고
					String name = JOptionPane.showInputDialog("조회할 사원이름\n이전단계로 이동하려면 up을 입력하세요\n종료하려면 q를 입력하세요")
							.toLowerCase();
					if (name.equals("up")) {
						break;
					} else if (name.equals("q")) {
						bool = false;
						break;
					}
					// 이름으로 사원정보 조회
					printNameLessInfo(name);
				}
				break;
			}
		}
	}

	// 급여 수정
	public void editNameSal() {
		String name = JOptionPane.showInputDialog("이름입력");
		int sal = Integer.parseInt(JOptionPane.showInputDialog("수정급여"));
		int cnt = eDao.editNameSal(name, sal);
		if (cnt == 0) {
			JOptionPane.showMessageDialog(null, "급여 수정에 실패했습니다");
		} else {
			JOptionPane.showMessageDialog(null, cnt + "명의 급여를 수정했습니다.");
		}
	}

	// 부서번호 리스트를 출력해주고 부서번호를 입력받아서
	// 부서원 리스트를 보여주는 기능
	public void getDnoMemberList() {
		while (true) {
			ArrayList<Integer> dnoList = eDao.getDnoList();
			System.out.println();
			System.out.print("| ");
			for (int dno : dnoList) {
				System.out.print(dno + " | ");
			}
			System.out.println();

			// 부서번호 입력받기
			String sno = JOptionPane.showInputDialog("부서번호를 입력하세요\n이전단계로 이동하려면 up을 입력하세요\n프로그램을 종료하려면 q를 입력하세요")
					.toLowerCase();
			if (sno.equals("up")) {
				break;
			} else if (sno.equals("q")) {
				bool = false;
				break;
			}
			int dno = Integer.parseInt(sno);
			// 부서원 정보 조회
			ArrayList<EmpVO> list = eDao.getDnoMemberList(dno);

			// 부서원 출력
			System.out.println("========" + dno + " 번 부서 ========");
			for (EmpVO vo : list) {
				System.out.printf("사원번호: %8d\n이름:%13s\n직급: %12s\n급여: %12d\n\n", vo.getMno(), vo.getName(), vo.getJob(),
						vo.getSal());
			}
		}
	}

	// 사원이름을 입력받아서 사원의 정보를 출력해주는 함수
	public void printNameInfo(String name) {
		EmpVO eVO = eDao.getNameInfo(name.toUpperCase());
		String ename = eVO.getName();
		int mno = eVO.getMno();
		String job = eVO.getJob();
		String sname = eVO.getSname();
		int sal = eVO.getSal();
		int grade = eVO.getGrade();
		int comm = eVO.getComm();
		String dname = eVO.getDname();
		String sdate = eVO.getSdate();

		System.out.println("사원번호: " + mno);
		System.out.println("사원이름: " + ename);
		System.out.println("직급: " + job);
		System.out.println("상사이름:" + sname);
		System.out.println("급여: " + sal);
		System.out.println("급여등급:" + grade);
		System.out.println("커미션: " + comm);
		System.out.println("부서이름: " + dname);
		System.out.println("입사일: " + sdate);
	}
	// HW 사원이름을 입력받아서 사원번호, 사원이름, 급여, 입사일, 부서번호를 출력하는 함수
	public void printNameLessInfo(String name) {
		EmpVO eVO = eDao.getNameLessInfo(name.toUpperCase());
		int mno = eVO.getMno();
		String ename = eVO.getName();
		int sal = eVO.getSal();
		String sdate = eVO.getSdate();
		int dno = eVO.getDno();

		System.out.println("사원번호: " + mno);
		System.out.println("사원이름: " + ename);
		System.out.println("급    여: " + sal);
		System.out.println("입 사 일: " + sdate);
		System.out.println("부서번호: " + dno);
	}

	// 사원이름 리스트 조회해서 출력해주는 함수
	public void printNameList() {
		ArrayList nameList = eDao.getNameList();
		System.out.print("| ");
		for (int i = 0; i < nameList.size(); i++) {
			System.out.print((String) nameList.get(i) + " | ");
		}
		System.out.println();
	}

	// 사원 추가 함수
	public void addEmp() {
		EmpVO eVO = new EmpVO();
		eVO.setName("wooyoung");
		eVO.setJob("MANAGER");
		eVO.setSname("SMITH");
		eVO.setSal(500);
		eVO.setComm(-500);
		eVO.setMail("wooyoung@githrd.com");

		int cnt = eDao.addEmp(eVO);
		if (cnt == 1) {
			JOptionPane.showMessageDialog(null, eVO.getName() + " 이 입사했습니다.");
		} else {
			JOptionPane.showMessageDialog(null, eVO.getName() + " 의 입사가 취소되었습니다.");
		}
	}

	// 사원 추가 함수 오버로딩
	public void addEmp(String name, String job, String sname, int sal, int comm) {
		EmpVO eVO = new EmpVO();
		eVO.setName(name);
		eVO.setJob(job);
		eVO.setSname(sname);
		eVO.setSal(sal);
		eVO.setComm(comm);
		eVO.setMail(name + "@githrd.com");

		int cnt = eDao.addEmp(eVO);
		if (cnt == 1) {
			JOptionPane.showMessageDialog(null, eVO.getName() + " 이 입사했습니다.");
		} else {
			JOptionPane.showMessageDialog(null, eVO.getName() + " 의 입사가 취소되었습니다.");
		}
	}

	public static void main(String[] args) {
		new EmpController();
	}

}
