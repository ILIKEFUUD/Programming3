import java.util.Scanner;
import java.util.Stack;

/*
 * Rahul Shah
 * pd7
 * 2/4/16 
 * Postfix.java takes a postfix expression and uses
 * stacks to return the answer
 */
public class Postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double answer = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a postfix expression");
		String expression = scan.nextLine();
		
		//stack to hold the expression 
		Stack<Double> ex = new Stack<Double>();
		String[] newEx = expression.split(" ");//split expression by spaces
		double temp = 0;//temporary variable to hold previously popped, used for / - %
		for(int x = 0; x < newEx.length; x++){
			//addition
			if(newEx[x].equals("+")){
				answer = ex.pop() + ex.pop();
				ex.push(answer);
			}
			//multiplication
			else if(newEx[x].equals("*")){
				answer = ex.pop() * ex.pop();
				ex.push(answer);
			}
			//subtraction
			else if(newEx[x].equals("-")){
				temp = ex.pop();
				answer = ex.pop() - temp;
				ex.push(answer);
			}
			//division
			else if(newEx[x].equals("/")){
				temp = ex.pop();
				answer = ex.pop()/temp;
				ex.push(answer);
			}
			//modulus
			else if(newEx[x].equals("%")){
				temp = ex.pop();
				answer = ex.pop()%temp;
				ex.push(answer);
			}else{//if its a num, push to stack
				ex.push(Double.parseDouble(newEx[x]));
			}
			
		}
		//output the answer 
		System.out.println("Answer is: " + ex.peek());
		
		
		
	}//end of main

}//end Postfix
