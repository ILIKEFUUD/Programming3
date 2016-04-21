import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class WordCounter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a file name");
		String file = scan.nextLine();
		scan.close();
		FileReader f = new FileReader(file);
		Scanner in = new Scanner(f);
		
		//find number of characters
		int chars =0, words = 0, lines = 0;
		
		while(in.hasNextLine()){
			lines++;
			String line = in.nextLine();
			chars += line.length();
			words += line.split("\\s+").length;
		}
		
		System.out.println(chars);
		System.out.println(words);
		System.out.println(lines);
		
		in.close();
		
		

	}

}
