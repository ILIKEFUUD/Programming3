
public class RecursionTeester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Test for P13.1
		System.out.println("Sentence 1");
		System.out.println("Original: 123");
		Sentence s = new Sentence("123");
		s.reverse();
		System.out.println(s.getText());
		
		//Test for P13.1
		System.out.println("Sentence 2");
		System.out.println("The quick brown fox jumped over the lazy dog, reverse 0 to 11");
		Sentence2 s2 = new Sentence2("The quick brown fox jumped over the lazy dog", 0,11);
		s2.reverse();
		System.out.println(s2.getText());
		
		//Test for P13.3
		System.out.println("Sentence 3, with a loop this time!");
		System.out.println("Original is TTEEEEEEESSSSTT");
		Sentence3 s3 = new Sentence3("TTEEEEEEESSSSTT");
		s3.reverse();
		System.out.println(s3.getText());
	}

}
