import java.util.LinkedList;
import java.util.Queue;

/*
 * Rahul Shah
 * Pd 7
 * 2/10/16
 * Represents a line of customers
 */
public class Line {
	Queue<Customer> queue;
	//creates a new line based on a queue
	public Line(){
		queue = new LinkedList<Customer>();
		
	}
	
	//removes a customer from the head of the queue
	public Customer nextCustomer(){
		return queue.poll();
	}
	
	//adds a customer to the tail of the queue
	public void addCustomer(Customer person){
		queue.add(person);
	}
	//indicates whether the queue is empty
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	//returns the number of customers in the queue
	public int size(){
		return queue.size();
	}
}
