
public class FindString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sentence 4");
		System.out.println("Original is HELLO HOLE");
		Sentence4 s = new Sentence4("HELLO HOLE");
		System.out.println("Look for HOL");
		System.out.println(s.find("HOL"));
		
		System.out.println("Sentence 5");
		System.out.println("Original is Hello World");
		Sentence5 s2 = new Sentence5("Hello world");
		System.out.println("search for wo, return index of wo");
		System.out.println(s2.indexOf("wo"));
		

	}

}
