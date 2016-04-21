import java.awt.Color;
import java.util.HashSet;
import java.util.Scanner;

/*
 * Rahul Shah
 * ColorSet
 * 
 * Insert the 13 standard colors that the Color class
predefines (that is, Color.PINK, Color.GREEN, and so on) into a set.
Prompt the user to enter a color by specifying red, green, and blue integer
values between 0 and 255. Then tell the user whether the resulting color is
in the set.
 * 
 */
public class ColorSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int r, g,b;
		
		HashSet colors = new HashSet();
		
		colors.add(Color.BLACK);
		colors.add(Color.BLUE);
		colors.add(Color.CYAN);
		colors.add(Color.DARK_GRAY);
		colors.add(Color.GREEN);
		colors.add(Color.LIGHT_GRAY);
		colors.add(Color.MAGENTA);
		colors.add(Color.PINK);
		colors.add(Color.ORANGE);
		colors.add(Color.RED);
		colors.add(Color.WHITE);
		colors.add(Color.YELLOW);
		
		System.out.println("ENTER RED: ");
		r = scan.nextInt();
		System.out.println("ENTER GREEN: ");
		g = scan.nextInt();
		System.out.println("ENTER BLUE: ");
		b = scan.nextInt();
		
		Color c = new Color(r,g,b);
		
		System.out.println("Found: " + colors.contains(c));
		

	}

}
