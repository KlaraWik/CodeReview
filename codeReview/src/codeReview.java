import java.io.*;
import java.util.Scanner;

public class codeReview{
	
	public static void main(String[] args) throws FileNotFoundException{
		String word = args[0];
		String searchFile = args[1];

		File file = new File(searchFile);

		Scanner text = new Scanner(file); //vilken fil som ska letas
		
		while(text.hasNextLine()) {
			String line = text.nextLine();

			if (line.contains(word)) {
				System.out.println(line);
			}
		}
		text.close();
    }
}
