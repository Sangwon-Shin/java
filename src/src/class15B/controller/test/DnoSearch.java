package class15B.controller.test;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import class15B.dao.*;
import class15B.vo.EmpVO;

public class DnoSearch implements Father {
	private Test01 main;
	private EmpDao eDao;
	/*
	public DnoSearch() {
		eDao = new EmpDao(); 
	}
	*/
	public DnoSearch(EmpDao eDao) {
		this.eDao = eDao; 
	}
	public DnoSearch(Test01 main) {
		this.main = main;
		eDao = main.geteDao();
	}

	@Override
	public void satang() {
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
				//bool = false;
				main.setBool(false);
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

}
