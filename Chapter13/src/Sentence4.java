/*
 * Rahul Shah
 */
public class Sentence4 {

	String s;
	String answer;
	int counter = 0;
	int len = 0;
	int findCounter;
	//Constructor for 12.1
	public Sentence4(String word) {
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
	
	public boolean find(String t){
		if(findCounter > len - t.length())
			return false;
		else if(s.substring(findCounter, findCounter+t.length()).equals(t)){
			return true;
		}else{
			findCounter++;
			return(find(t));
		}
	}
	

}
