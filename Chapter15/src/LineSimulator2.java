/*
 * Rahul Shah
 * 2/18/16
 * LineSimulator2.java
 * now has 4 separate lines and determines the line that had the shortest wait time
 * meaning it took the most amount of people 
 */
public class LineSimulator2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// make line
		Line[] lines = new Line[4];
		lines[0] = new Line();
		lines[1] = new Line();
		lines[2] = new Line();
		lines[3] = new Line();
		int[] customers = new int[4];
		int customerCount = 0;
		int rand = (int) (Math.random() * 20) + 10;
		
		// random number of iterations
		for (int x = 0; x < rand; x++) {
			System.out.println("*************************************\n\nITERATION: "+ x);
			//print the lines at the beginning
			System.out.println("\nBefore: ");
			for(int c = 0; c < lines.length; c++){
				System.out.println("Line" + (c+1) + ": " + lines[c].queue);
			}
			// randomly add customers
			int addOrNaw = (int) (Math.random() * 2);
			int doneCustomer = (int) (Math.random() * 2);
			if (addOrNaw == 1) {// 50% chance new customer shows up
				// add random number of customers
				int newCustomers = (int) (Math.random() * 3) + 1;
				for (int i = 0; i < newCustomers; i++) {
					Customer c = new Customer(customerCount);
					//determine shortest line
					//line1 is default line
					int small = lines[0].size();
					int smallestLine = 0;
					//find the line that is smallest
					for(int j = 0; j < lines.length; j++){
						if(small >= lines[j].size()){
							small = lines[j].size();
							smallestLine = j;
						}
					}
					lines[smallestLine].addCustomer(c);//add a customer to  the shortest line
					//increment the customer's id (their number)
					customerCount++;
					
					//output
					System.out.println(c + " got in line " + (smallestLine+1));
					
					//randomly takes care of people in the lines
					for(int j = 0; j < lines.length; j++){
						if(doneCustomer == 1){//50% chance customer is done
							//remove guy in head of the line
							if(!lines[j].isEmpty()){
								int numLeave = (int)(Math.random()*lines[j].size())+1;//random number of people taken care of
								for(;i < numLeave;  i++){//run numLeave times, but stop before new added runs out
									//not necessary but looks nice, more practical
									System.out.println(lines[j].nextCustomer() + " has been taken care of in line " + j);
									//increment relevant customers element
									customers[j]++;
								}
							}
						}
					}//end for loop, end taking care of people
				}//end outer for loop, end adding/removing people
				
				
			}//end if statement
			// if nothing happens, print this out
			else if (addOrNaw == 0 && doneCustomer == 0) {
				System.out.println("Everyone is waiting...");
			}
			//break for formatting
			System.out.println("\n--------------THEN----------------\n");
			//print out lines at the end of the iteration
			System.out.println("After:");
			for(int c = 0; c < lines.length; c++){
				System.out.println("Line" + (c+1) + ": " + lines[c].queue);
			}
		}// end for loop
		
		//figure out shortest wait time
		int longest  = 0;
		int shortestWaitTime = 0;
		for(int t = 0; t < customers.length; t++){
			if(customers[t] > longest){
				shortestWaitTime = t;
			}
		}
		//print out line that had the shortest wait time
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Line " + (shortestWaitTime+1) + " had the shortest wait time");//plus 1 because t starts at 0
		
	}// end main
	
	
	
}//end LineSimulator
