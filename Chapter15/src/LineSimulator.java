/*
 * Rahul Shah
 * Pd 7
 * 2/10/16
 * Simulates a line using the Line class
 */
public class LineSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//make line
		Line line1 = new Line();
		int customerCount = 0;
		int rand = (int)(Math.random()*20) + 10;
		
		//random number of iterations
		for(int x = 0; x < rand; x++){
			System.out.println("*************************************\n\nITERATION: " +  x );
			//randomly add customers
			int addOrNaw = (int)(Math.random()*2);
			int doneCustomer = (int)(Math.random()*2);
			if(addOrNaw == 1 && line1.size() <= 4){//50% chance new customer shows up
				//add random number of customers
				int newCustomers = (int)(Math.random()*3)+1;
				for(int i = 0; i < newCustomers; i++){
					Customer c = new Customer(customerCount);
					line1.addCustomer(c);
					customerCount++;
					System.out.println(c + " got in line");
				}
			}
				
			if(doneCustomer == 1){//50% chance new customer shows up
				//remove guy in head of the line
				if(!line1.isEmpty()){
					int numLeave = (int)(Math.random()*line1.size())+1;
					for(int i = 0; i < numLeave; i++){
						System.out.println(line1.nextCustomer() + " has been taken care of.");
					}
				}
			}
			//if nothing happens, print this out
			if(addOrNaw == 0 && doneCustomer == 0){
				System.out.println("Everyone is waiting...");
			}
			
			System.out.println("Current line: " + line1.queue.toString());
		}//end for loop
	}//end main

}//end line simulator
