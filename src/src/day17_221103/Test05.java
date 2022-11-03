package day17_221103;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test05 {
	JFrame fr;
	JPanel pan;
	JButton btn;
	public Test05() {
		fr = new JFrame("이쁜색");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pan = new JPanel();
		pan.setBackground(Color.WHITE);
		fr.add(pan, BorderLayout.CENTER);
		btn = new JButton("Color Change");
		btn.addActionListener(new BtnEvt(this));
		fr.add(btn, BorderLayout.SOUTH);
		fr.setResizable(false);
		fr.setSize(300, 400);
		fr.setVisible(true);
	}

	public static void main(String[] args) {
		new Test05();
	}

}
