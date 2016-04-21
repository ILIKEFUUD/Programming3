/*
 * Rahul Shah
 * Pd 7 
 * 12/21/15
 */
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KochComponent extends JComponent {
	private int iter, len;
	//KochComponent object
	public KochComponent(int count, int length) {
		iter = count;
		len = length;
	}

	public void paintComponent(Graphics g) {
		KochLine line = new KochLine();
		int x1 = 10;
		int y1 = len / 2;
		int x2 = x1 + len;
		int y2 = y1;
		int x3 = x1 + (len / 2);
		int y3 = y1 + len;
		// call draw for the 3 Koch Lines
		line.draw(g, iter, x1, y1, x2, y2);
		line.draw(g, iter, x2, y2, x3, y3);
		line.draw(g, iter, x3, y3, x1, y1);
		repaint();
	}
	//sets iteration
	public void setComp(int count){
		iter = count;
		
	}
}//end of KochComponent