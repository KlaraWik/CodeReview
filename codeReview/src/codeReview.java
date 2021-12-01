import java.io.*;
import java.util.Scanner;

public class codeReview{
	
	public static void main(String[] args) throws FileNotFoundException{
		
		//System.out.println("search for word");
		String word = args[0];
		String searchFile = args[1];
		//Scanner scan = new Scanner(System.in);
		//String s = scan.nextLine();
		
		// få in textfil
		//File file = new File("nilsholg.txt");
		File file = new File(searchFile);

		//InputStream stream = StringSearcher.class.getResourceAsStream("file.txt");
		Scanner text = new Scanner(file); // vilken fil som ska letas
		
		while(text.hasNextLine()) {
			String line = text.nextLine();

			if (line.contains(word)) {
				System.out.println(line);
			}
		}
		text.close();
    }
}
