package class15B.controller.test;

import javax.swing.JOptionPane;
import java.util.*;
import class15B.dao.EmpDao;
import class15B.util.PageUtil;
import class15B.vo.EmpVO;

public class EmpList implements Father {
	/*
	 * EmpDao, boolean bool 을 이곳에서도 사용해야 한다. 따라서 두 개를 가지고 있는 Test01 객체를 전달받아서 이 클래스가
	 * new 되는 순간 접근할 수 있게 한다.
	 * 
	 */
	private Test01 main;
	private EmpDao eDao;

	public EmpList() {}

	public EmpList(Test01 main) {
		this.main = main;
		eDao = main.geteDao();
	}
	
	@Override
	public void satang() {
		// 총 사원수 조회
		int nowPage = 1;
		int total = 0;
		int pageRow = 4;
		int pageGroup = 4;
		PageUtil page = new PageUtil(nowPage, total, pageRow, pageGroup);
		ArrayList<EmpVO> list = null;
		// 기본 페이지 출력
		// 출력
		while (true) {
			// 총 사원 수 조회
			total = eDao.getTotal();
			// 페이지 정보 객체 세팅
			page.setPageUtil(nowPage, total, pageRow, pageGroup);
			// 리스트 가져오고
			list = eDao.getEmpList(page);
			// 출력
			printEmpList(list, page);
			// 이동 페이지번호 입력 받고
			String msg = JOptionPane.showInputDialog("페이지번호를 입력하세요\n상위메뉴: up\n프로그램종료: exit");
			// 메시지 내용에 따라서 조건처리 한다.
			if(msg.toUpperCase().equals("UP")) {
				break;
			} else if(msg.toUpperCase().equals("EXIT")) {
				main.setBool(false);
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다");
				break;
			} else {
				nowPage = Integer.parseInt(msg);
			}
		}
	}
	/*
	@Override
	public void satang() {
		// 총 사원수 조회
		int total = eDao.getTotal();
		int pageRow = 4;
		int pageGroup = 5;
		PageUtil page = new PageUtil(nowPage, total, pageRow, pageGroup);
		boolean isStart = true;
		// 기본 페이지 출력
		ArrayList<EmpVO> list = eDao.getEmpList(page);
		// 출력
		while (true) {
			// PageUtil(int nowPage, int totalCount, int pageRow, int pageGroup) 사용
			// 총 사원수 조회
			if (!isStart) {
				total = eDao.getTotal();
				page.setPageUtil(nowPage, total);
				list = eDao.getEmpList(page);
			} else {
				isStart = false;
			}
			printEmpList(list, page);
			// 메시지 입력 받고
			String msg = JOptionPane.showInputDialog("페이지번호를 입력하세요\n상위메뉴: up\n프로그램종료: exit");
			// 메시지 내용에 따라서 조건처리 한다.
			if(msg.toUpperCase().equals("UP")) {
				break;
			} else if(msg.toUpperCase().equals("EXIT")) {
				main.setBool(false);
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다");
				break;
			} else {
				nowPage = Integer.parseInt(msg);
			}
		}
	}
	*/
	public void printEmpList(ArrayList<EmpVO> list, PageUtil page) {
		// 리스트에 채워진 길이만큼 반복해서 내용을 출력
		System.out.printf("---------------------------------------------\n");
		for(int i = 0; i < list.size(); i++) {
			EmpVO eVO = list.get(i);
			int mno = eVO.getMno();
			int dno = eVO.getDno();
			String name = eVO.getName();
			String sdate = eVO.getSdate();
			System.out.printf(
					"%-5d | %-10s | %15s | %2d\n"
					, mno, name, sdate, dno);
		}
		System.out.printf("---------------------------------------------\n");
		printPage(page);
	}
	
	// 이동 가능한 페이지 번호 출력하기
	public void printPage(PageUtil page) {
		System.out.print("\t| pages |");
		for(int i = page.getStartPage(); i < page.getEndPage() + 1; i++) {
			if(i == page.getNowPage()) {
				System.out.printf(" * %d * |", i);
				continue;
			}
			System.out.printf(" %d |", i);
		}
		System.out.print("\n\n");
	}
}
