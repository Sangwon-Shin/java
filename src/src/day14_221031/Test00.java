// 1. JFrame 을 상속받든지
// 2. JFrame 객체를 만들어서 사용.

package day14_221031;

import javax.swing.*; // JFrame
//public class Test00 extends JFrame{	

public class Test00 {
	JFrame fr;

	public Test00() {
		/*
		 * this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setSize(400, 300);
		 * setVisible(true);
		 */
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(400, 300);
		fr.setVisible(true);

	}

	public static void main(String[] args) {
		new Test00();
	}

}
