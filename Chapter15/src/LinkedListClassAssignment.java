import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Rahul Shah
 * LinkedList class exploration
 * implements a reverse and a downsize method for a linked list
 * represents news reporters
 * 2/1/16 
 * Pd 7 Amberg Prog3
 */
public class LinkedListClassAssignment {
	
	public static void main(String[] args){
		LinkedList<String> reporters = new LinkedList<String>();
		//variables using the LinkedList class from java.util to create a list
		reporters.add("Erin Andrews");
		reporters.add("Anderson Cooper");
		reporters.add("Michaela Pereira");
		reporters.add("Brian Williams");
		reporters.add("Lara Logan");
		reporters.add("Chris Cuomo");
		reporters.add("Kate Bolduan");
		reporters.add("Diane Sawyer");
		reporters.add("Ann Curry");
		reporters.add("Rachel Maddow");
		reporters.add("Tamron Hall");
		reporters.add("Christiane Amanpour");
		reporters.add("Michaela Pereira");
		
		//outputs it on one line
		System.out.println(reporters);
		
		//to output on seperate lines - using a ListIterator
		ListIterator<String> iterator = reporters.listIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//size method
		System.out.println("\n*** Size Method ***");
		System.out.println(reporters.size());
		/*STOP AND RUN HERE*/
		
		//Demonstrate the set method example in LinkedList
		reporters.set(2, "Jon Stewart");
		System.out.println("\n***************\n3rd element Jon Stewart\n");
		iterator = reporters.listIterator();//reset to front and then use next to move
		iterator.next();
		iterator.next();
		iterator.next();
		iterator.add("Katie Couric");
		
		iterator = reporters.listIterator();//reset to front
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		/*STOP AND RUN HERE*/
		
		System.out.println("\n***********\n" + "remove Katie Couric as 4th item using iterator \n");
		iterator = reporters.listIterator();//reset to front
		iterator.next();
		iterator.next();
		iterator.next();
		iterator.next();
		iterator.remove();
		
		iterator = reporters.listIterator();//reset to front
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//STOP AND RUN HERE!
		
		//IMPLEMENT THE REVERSE METHOD
		
		System.out.println("\n*************\nreverse\n");
		reverse(reporters);
		iterator = reporters.listIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//STOP AND RUN HERE
		
		//IMPLEMENT THE DOWNSIZE METHOD
		System.out.println("\n*************\ndownsize\n");
		downsize(reporters);
		iterator = reporters.listIterator();//reset to front
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//RUN HERE TO TEST THE downsize method
	}//end main 
	
	
	//using only the public interface of LinkedList class, write method that removes every other reporter
	public static void downsize(LinkedList<String> staff){
		LinkedList<String> answer = new LinkedList<String>();
		int size = staff.size();
		for(int x = 0; x < size; x+=2){
			answer.add(staff.get(x));
		}
		staff.clear();
		for(int x = 0; x < answer.size(); x++){
			staff.add(answer.get(x));
		}
	}//end downsize
	
	//using only the public interface of LinkedList class, write method that reverses entries
	public static void reverse(LinkedList<String> staff){
		LinkedList<String> answer = new LinkedList<String>();
		int size = staff.size();
		for(int x = 0; x < size; x++){
			answer.add(staff.getLast());
			staff.removeLast();
		}
		for(int x = 0; x < answer.size(); x++){
			staff.add(answer.get(x));
		}
		
	}//end reverse
	
	

}//end LinkedListClassAssingment
