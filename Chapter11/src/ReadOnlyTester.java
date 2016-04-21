import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class ReadOnlyTester {
	
	public static void main(String[] args) throws FileNotFoundException{
		PrintWriter writer = new PrintWriter("RedOnly.txt");
		
		writer.print("DADADADADADA");
		
		writer.close();
	}

}
