/*
 * Rahul Shah
 * PD7
 * 
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GregorianCalendar g = new GregorianCalendar();
		g.add(Calendar.DAY_OF_MONTH, 100);
		System.out.println(g.get(Calendar.MONTH) + 1  
				+ ", " +  g.get(Calendar.DAY_OF_MONTH) + ", " + g.get(Calendar.YEAR));
		
		
		g = new GregorianCalendar(1999, 4, 30);
		System.out.println("The " + g.get(Calendar.DAY_OF_WEEK) + " Day of the week");
		
		
		g.add(Calendar.DAY_OF_MONTH, 10000);
		System.out.println(g.get(Calendar.MONTH) + 1 + ", " 
		+  g.get(Calendar.DAY_OF_MONTH) + ", " +  g.get(Calendar.YEAR));
		
		
		
	}

}
