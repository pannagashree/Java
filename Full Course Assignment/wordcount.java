import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
class WordCount{
	public static void main(String[] args) throws IOException {
		String content=new String(Files.readAllBytes(Paths.get("random2.txt")));
		String[] cont=content.split("[\\r\\n]+");
		Arrays.sort(cont,(s1,s2)->s2.split("\\s").length-s1.split("\\s").length);	//Descending order
		for(String s:cont)
			System.out.println(s);
	}
}