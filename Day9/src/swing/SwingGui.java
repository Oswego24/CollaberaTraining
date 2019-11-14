package swing;

import java.awt.BorderLayout;

import javax.swing.*;

public class SwingGui {

	public static void main(String[] args) {

		//Creating the Frame
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		
		//Creating the MenuBar and adding components
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("File");
		JMenu m2 = new JMenu("Help");
		mb.add(m1);
		mb.add(m2);
		JMenuItem mI = new JMenuItem("Open");
		JMenuItem mI2 = new JMenuItem("Save as");
		m1.add(mI);
		m2.add(mI2);
		
		//Creating the panel at the bottom and adding components
		JPanel panel = new JPanel(); //The panel is not visible in output
		JLabel label = new JLabel("Enter Text");
		JTextField tf = new JTextField(10);
		JButton send = new JButton("Send");
		JButton reset = new JButton("Reset");
		panel.add(label); //Components added using flow layout
		panel.add(tf);
		panel.add(send);
		panel.add(reset);
		
		//Text area at the center
		JTextArea ta = new JTextArea();
		
		//Adding components to the frame
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, mb);
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.setVisible(true);
	}
}