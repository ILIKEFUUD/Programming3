import java.awt.Rectangle;


public class AreaTester {
	
	public static void main (String[] args){
		
		Rectangle r = new Rectangle(10,20);
		
		double w = r.getWidth();
		double h = r.getHeight();
		
		System.out.println("It's " + w*h);
		System.out.println("Should really be " + 12*14);
		
		
	}

}
