import java.util.Scanner;
import java.util.TreeSet;
/*
 * Rahul Shah
 * 3/23/16
 * Uses a treeset to calculate unique words in a sentence
 */

public class TreeSetInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//make treeset
		TreeSet set = new TreeSet();
		Scanner scan = new Scanner(System.in);
		String sentence;
		
		//input sentence
		System.out.println("Enter stuff: ");
		sentence = scan.nextLine();
		//split sentence
		String[] str = sentence.split(" ");
		
		//add to set
		for(String i: str){
			set.add(i);
		}
		
		//print out set and the size
		int size = set.size();
		System.out.println(set);
		System.out.println("Size: " + size);

	}//end of main

}//end of main
