/*
 * Rahul Shah
 */
public class Sentence {

	String s;
	String answer;
	int counter = 0;
	int len = 0;
	
	//Constructor for 12.1
	public Sentence(String word) {
		s = word;
		answer = "";
		len = word.length();
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
