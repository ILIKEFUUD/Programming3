/*
 * Rahul Shah
 */
public class Sentence3 {

	String s;
	String answer;
	int counter = 0;
	int len = 0;
	
	
	public Sentence3(String word) {
		s = word;
		answer = "";
		len = word.length();
	}
	

	public void reverse() {
		
		for(int x = 0; x < len; x++){
			answer = s.substring(x, x+1) + answer;
		}
		
	}
	
	
	public String getText(){
		return answer;
	}

}
