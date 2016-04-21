/*
 * Rahul Shah
 * Pd 7 
 * 12/21/15
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class KochLine {

	public void draw(Graphics g, int iteration, double x1, double y1,
			double x2, double y2) {
		//I was stupid but now it's good
		double angle;
		double dx, dy, x3, y3, x4, y4, x5, y5;

		Graphics2D g2 = (Graphics2D) g;
		//base case
		if (iteration == 1) {
			g2.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
		} else {
			angle = 60 * ((Math.PI) / 180);
			dx = (x2 - x1) / 3;
			dy = (y2 - y1) / 3;
			x3 = x1 + dx;
			y3 = y1 + dy;
			x4 = x2 - dx;
			y4 = y2 - dy;
			x5 = x3 + dx * Math.cos(angle) + dy * Math.sin(angle);
			y5 = y3 + dy * Math.cos(angle) - dx * Math.sin(angle);

			// recursive drawing of lines
			draw(g, iteration - 1, x1, y1, x3, y3);
			draw(g, iteration - 1, x3, y3, x5, y5);
			draw(g, iteration - 1, x5, y5, x4, y4);
			draw(g, iteration - 1, x4, y4, x2, y2);

		}

	}//end of draw

}//end of KochLine
