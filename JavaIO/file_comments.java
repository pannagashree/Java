import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
class FileComment{
	public static void main(String[] args) {
		try{
			//BufferedReader br=new BufferedReader(new FileReader("sample.java"))
			String contents=new String(Files.readAllBytes(Paths.get("sample.java")));
			contents=contents.replaceAll("//.*|(?s)/\\*.*?\\*/","");
			System.out.println(contents);
		}catch(IOException e){
			System.out.println("Unable to read the file");
		}
	}
}