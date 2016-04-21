
public class ListNode {
	//data members
	private Object value;//what it stores
	private ListNode next;//a reference to the next ListNode in the list
	
	//constructor
	public ListNode (Object initVal, ListNode initNext){
		value = initVal;
		next = initNext;
	}
	
	//accessors
	//returns the value of this node
	public Object getValue(){
		return value;
	}
	
	//returns the reference to the next node following this node
	public ListNode getNext(){
		return next;
	}
	
	//modifiers
	//sets the value of this node
	public void setValue(Object newVal){
		value = newVal;
	}
	
	//sets the next reference of this node
	public void setNext(ListNode newNext){
		next = newNext;
	}
	
}//end ListNode
