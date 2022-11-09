package class15B.controller.test;
import javax.swing.JOptionPane;

import class15B.dao.*;
public class EditSal implements Father {
	private Test01 main;
	private EmpDao eDao;
	//public EditSal() {}
	public EditSal(EmpDao eDao) {
		this.eDao = eDao;
	}
	public EditSal(Test01 main) {
		this.main = main;
		eDao = main.geteDao();
	}
	
	@Override
	public void satang() {
		String name = JOptionPane.showInputDialog("이름입력");
		int sal = Integer.parseInt(JOptionPane.showInputDialog("수정급여"));
		int cnt = eDao.editNameSal(name, sal);
		if (cnt == 0) {
			JOptionPane.showMessageDialog(null, "급여 수정에 실패했습니다");
		} else {
			JOptionPane.showMessageDialog(null, cnt + "명의 급여를 수정했습니다.");
		}
	}

}
