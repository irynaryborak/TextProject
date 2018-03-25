import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Text {
	
		
	
			public static void main(String[] args) throws IOException {
				
			String str = new String(Files.readAllBytes(Paths.get("bin/files/data.txt")));
			
			System.out.println("Please enter length of word");
				
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			sc.close();
		
			String[] sentences = str.trim().split("(?<=\\.\\s)|(?<=[?]\\s)");
			
			TreeSet<String> al=new TreeSet<String>();  
						
			for (String sentence : sentences){
				
				if (sentence.contains("?")) {
					String[] words = (sentence + " ").split("\\p{P}?[ \\t\\n\\r]+");
															
						for (String i: words){
						if (i.length() == a){
						al.add(i);  
							}
						}
					}
				}
			Iterator<String> itr=al.iterator();  
			  while(itr.hasNext()){  
			  System.out.println("\nWord with length " + a + " is: " + itr.next());  
			}  	
	}
}