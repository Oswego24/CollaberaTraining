package optionpane;

import javax.swing.*;

public class OptionPaneTest {
	JFrame f;
	OptionPaneTest(){
		f = new JFrame();
	}
	void showMessage(String msg) {
		JOptionPane.showMessageDialog(f, msg);
	}
	public static void main(String[] args) {
		OptionPaneTest object = new OptionPaneTest();
		String m = JOptionPane.showInputDialog("Your Input: ", "Enter your input here");
		System.out.println(m);
		object.showMessage("Custom Message: " + m);
	}

}
