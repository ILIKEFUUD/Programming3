import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Rahul Shah
 * 4/4/16
 * creates a map of students and their grades
 * Performs several operations on the map
 */
public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Map of students and their grades stored as strings
		TreeMap map = new TreeMap<String, String>();

		// insert students
		Scanner scan = new Scanner(System.in);
		String name;//students names
		String grade;//students grades
		String cont;//checks if you want to continue
		
		//keep adding students
		do {
			
			//ask for name
			System.out.println("Enter a name: ");
			name = scan.nextLine();//input name
			
			//ask for grade
			System.out.println("Enter a grade: ");
			grade = scan.nextLine();//input grade

			//enter name and grade into the map as value and key
			map.put(name, grade);
			
			//ask to continue
			System.out.println("Continue? y/n");
			cont = scan.nextLine();
		} while (!cont.equals("n"));//checks if user wants to continue

		//menu with choices
		int choice = 0;//represents menu option
		while (choice != 5) {
			//ask choice
			System.out.println("What would you like to do?");
			System.out.println("1. Add Student\n2. Remove Student\n3. Modify Grades\n4. Print Students and Grades\n5. Exit");
			choice = scan.nextInt();
			scan.nextLine();
			
			//execute menu operation based on choice
			switch (choice) {
			case 1://Add student
				System.out.println("Enter student name: ");
				name = scan.nextLine();
				System.out.println("Enter grade: ");
				grade = scan.nextLine();
				map.put(name, grade);
				break;
			case 2://Remove student
				System.out.println("Enter name of student to remove: ");
				name = scan.nextLine();
				map.remove(name);
				break;
			case 3://Modify grades
				System.out.println("Enter name of student you wish to change the grades of: ");
				name = scan.nextLine();
				
				System.out.println("Enter the new grade: ");
				grade = scan.nextLine();
				
				map.remove(name);//remove old student
				map.put(name, grade);//add new student with same name, new grade
				break;
			case 4://Print students
				System.out.println("--------------------------------------------------------");
				Set<String> set = map.keySet();
				for (String str : set) {
					System.out.println(str + ": " + map.get(str));
				}
				System.out.println("--------------------------------------------------------");
				break;
			default://Exit if 5 or anything not 1-4 entered
				System.out.println("Done!");
			}// end of switch

		}// end of while

	}// end of main

}// end of StudentMap
