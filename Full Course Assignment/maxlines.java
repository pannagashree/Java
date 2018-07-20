import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
class MaxCharacters{
	public static void main(String[] args) throws IOException {
		String content=new String(Files.readAllBytes(Paths.get("random1.txt")));
		String[] cont=content.split("[\\r\\n]+");
		Arrays.sort(cont,(s1,s2)->s2.length()-s1.length());	//Descending order
		for(String s:cont)
			System.out.println(s);
	}
}