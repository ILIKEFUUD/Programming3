
import java.util.Scanner;


public class FloatSum {

	static Scanner scan = new Scanner(System.in);
	static float sum = 0.0f;
	static int counter = 0;
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		while(counter < 2){
			askFloats();
		}
		System.out.println("\nSum = " + sum);
	}
	
	public static void askFloats(){
		try{
			
			System.out.print("Enter float ");
			sum += scan.nextFloat();
			counter = 0;
		}catch(Exception e){
			counter++;
			scan.nextLine();
		}
	}

}
