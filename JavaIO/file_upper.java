import java.util.*;
import java.io.*;
class FileUpper{
	public static void main(String[] args) {
		try{
		BufferedReader br= new BufferedReader(new FileReader("/home/pannaga/java_course/JavaIO/text1.txt"));
		String line;
		line=br.readLine();
		System.out.println(line.toUpperCase());
		}catch(FileNotFoundException e){
			System.out.println("Unable to find the file");
		}catch(IOException e){
			System.out.println("Unable to read the file");
		}
	}
}