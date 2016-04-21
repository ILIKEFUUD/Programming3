/*
 * Rahul Shah
 * Pd 7 
 * 12/21/15
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class KochSnowflake {
	// main method
	public static void main(String[] args) {
		
		//frame
		JFrame frame = new JFrame("Dorito Simulator 2015");
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//input
		JButton iterations = new JButton("Next Iteration");
		JTextField f = new JTextField(6);
		
		//component
		KochComponent component = new KochComponent(1,300);
		component.setPreferredSize(new Dimension(600, 600));
		//Listens for value in text field
		class ClickListener implements ActionListener{
			//iter represents iteration
			int iter;
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				iter = Integer.parseInt(f.getText());
				component.setComp(iter);
			}
			
		}
		//add listener to button
		ActionListener d = new ClickListener();
		iterations.addActionListener(d);
		//add everything to panel, add panel to frame
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(f);
		panel.add(iterations);
		panel.add(component);
		frame.add(panel);
		//set frame visible
		frame.setVisible(true);
	}// end of main

}
