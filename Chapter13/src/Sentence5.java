/*
 * Rahul Shah
 * PD 7
 * 12/15/15
 * For 13.5
 */
public class Sentence5 {

	String s;
	String answer;
	int counter = 0;
	int len = 0;
	int findCounter;
	int index = -1;
	//Constructor for 12.1
	public Sentence5(String word) {
		s = word;
		answer = "";
		len = word.length();
		findCounter = 0;
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
	
	public int indexOf(String w){
		if(findCounter > len - w.length())
			return -1;
		else if(s.substring(findCounter, findCounter+w.length()).equals(w)){
			return findCounter;
		}else{
			findCounter++;
			index++;
			return(indexOf(w));
		}
	}
	
	

}