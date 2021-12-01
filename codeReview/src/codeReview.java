import java.io.*;
import java.util.Scanner;

public class codeReview{
	
	public static void main(String[] args) throws FileNotFoundException{
		
		System.out.println("search for word");
		
		Scanner scan = new Scanner(System.in); 
		String s = scan.nextLine();
		
		// få in textfil
		File file = new File("nilsholg.txt");

		//InputStream stream = StringSearcher.class.getResourceAsStream("file.txt");
		Scanner text = new Scanner(file); // vilken fil som ska letas
		
		while(text.hasNextLine()) {
			String line = scan.nextLine();
			
			if(line.contains(s)) {
				 System.out.println(line);
			}
		}  
		scan.close();
		text.close();
    }
}
