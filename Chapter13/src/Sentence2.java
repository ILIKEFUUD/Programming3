/*
 * Rahul Shah
 */
public class Sentence2 {

	String s;
	String answer;
	int counter = 0;
	int len = 0;
	
	//Constructor for 12.1
	public Sentence2(String word, int start, int end) {
		s = word;
		answer = "";
		len = end;
		counter = start;
	}
	

	public void reverse() {
		if (counter == len) {
			return;
		}
		
		answer = s.substring(counter, counter+1) + answer;
		counter++;
		reverse();
	}
	
	
	public String getText(){
		return answer;
	}

}
