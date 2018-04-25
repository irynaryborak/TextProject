import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

public class Text {

			public static void main(String[] args) throws IOException {

                byte[] bytes;

                    bytes = Files.readAllBytes(Paths.get("src/files/data.txt"));
                    String str =  new String(bytes, StandardCharsets.UTF_8);

                System.out.println("Please enter length of word");

                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                sc.close();

                String[] sentences = str.trim().split("(?<=\\.\\s)|(?<=[?]\\s)");

                Set<String> al = new TreeSet<>();

                for (String sentence : sentences) {

                    if (sentence.contains("?")) {
                        String[] allWords = (sentence + " ").split("\\p{P}?[ \\t\\n\\r]+");
                        for (String i : allWords) {
                            if (i.length() == a) {
                                al.add(i.toLowerCase());
                            }
                        }
                    }
                }
                  System.out.println(al);
            }
}
