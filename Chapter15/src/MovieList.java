/*
 * Rahul Shah
 * Represents a collection of movies
 */
public class MovieList {
	private ListNode list;

	// constuctor
	// sets up an empty list
	public MovieList() {
		list = null;
	}

	// Create a new MovieNode object and adds it to the end of the list
	public void add(Movie m) {
		ListNode newNode = new ListNode(m, null);
		ListNode current;
		if (list == null) {// add to head of empty list
			list = newNode;
		} else {
			current = list;// starts at front
			while (current.getNext() != null) {// while not last node
				current = current.getNext();// move to next Node;
			}
			current.setNext(newNode);// set the last node's next to newNode
		}
	}

	// return the list of movies as a String
	public String toString() {
		String movies = "";

		ListNode current = list;
		while (current != null) {
			movies += current.getValue().toString() + "\n";
			current = current.getNext();
		}

		return movies;
	}

	// removes a movie from the list, returns true if deleted, false if not
	// found
	public boolean delete(Movie m) {
		ListNode current = list;
		ListNode previous;
		if (m.equals((Movie) current.getValue())) {
			list = current.getNext();
			return true;
		} else {
			// go through list
			do {// do while goes until very last node, no extra case needed
				// keep track of previous and current node
				previous = current;
				current = current.getNext();
				// if movie is equal to the current node's movie,
				// set previous's next to current's next
				if (m.equals((Movie) current.getValue())) {
					previous.setNext(current.getNext());
					return true;
				}
			} while (current.getNext() != null);// end when next is empty
		}
		// return false if all else fails
		return false;
	}

	// adds movie to list in alphabetical order
	//accepts Movie m
	public void addInOrder(Movie m) {
		ListNode newNode = new ListNode(m, null);
		ListNode current = list;
		ListNode previous;
		if (list == null) {// if empty list add normally
			add(m);
		} else if (m.compareTo((Movie) current.getValue()) <= 0) {
			// case: first element after m alphabetically
			list = newNode;
			newNode.setNext(current);
			// list starts at newNode now, and newNode now points to current
		} else {
			// traverse linkedlist, check each current node with compareTo
			// set previous's next to newNode, and newNode to current
			boolean done = false;
			do {
				// previous represents previous node
				previous = current;
				// current is current node, moves up to next node
				current = current.getNext();
				if (m.compareTo((Movie) current.getValue()) <= 0) {//check if m is first alphabetically
					//set previous node to point to m and m to point to 
					//current
					previous.setNext(newNode);
					newNode.setNext(current);
					done = true;//leave loop when found place
				}
			} while (current.getNext() != null && !done);//keep going until last node or found place
			// if last movie is still alphabetically behind, just add the movie
			// regularly
			if (m.compareTo((Movie) current.getValue()) > 0) {
				add(m);
			}//end of if

		}//end of else

	}//end of addInOrder
}// end MovieList
