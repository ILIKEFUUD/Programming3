import java.util.Scanner;
import java.util.Stack;

/*
 * Rahul Shah
 * Pd7
 * 2/3/16
 * Decodes an entered string
 * uses stacks to reverse every word but keeps it
 * in the same position
 * import java.adele.Skyfall
 */
public class Decoder {
	
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a super secret encoded message, Mr. Bond");
			//string message
			String message = scan.nextLine() + " ";//add a space because that is how I check for words
			//string decoded message
			String answer = "";
			//stack used to decode
			Stack<Character> words = new Stack<Character>();
			//go in message, store chars in stacks
			for(int x = 0; x < message.length(); x++){
				if(message.charAt(x) != ' '){
					words.push(message.charAt(x));
				}
				else{//when a space is hit, go through stack and pop to answer until empty
					while(!words.isEmpty()){
						answer += words.pop();
						//word is now reversed
					}
					answer += " ";//add a space
				}
			}//end of loop
			
			//answer now holds the decoded message
			System.out.println("The message is: " + answer);
			
		}//end of main

}//end of Decoder
