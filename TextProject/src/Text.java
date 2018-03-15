import java.util.ArrayList;
import java.util.Scanner;

public class Text {
	
			public static void main(String[] args) {

			String str = "Test test? Java mentorship. Lenght of words in sentences? Created by Iryna.";
			
			System.out.println("Please enter length of word");
				
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			sc.close();
		
			String[] sentences = str.trim().split("(?<=\\.\\s)|(?<=[?]\\s)");
			
			ArrayList<String> text = new ArrayList<String>();
			
			for (String sentence : sentences){
				text.add(sentence);	
				} 
			
			for (String sentence : sentences){
				if (sentence.contains("?")) {
					String[] words = (sentence + " ").split("\\p{P}?[ \\t\\n\\r]+");
					
						for (String i: words){
						if (i.length() == a){
						System.out.print("\nWord with length " + a + " is: " + i + " \n");
						}
					}
				}
			}
	}
}