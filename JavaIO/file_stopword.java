import java.util.*;
import java.io.*;
class FileStopword{
	public static void main(String[] args) {
		try{
		BufferedReader br= new BufferedReader(new FileReader("stopword.txt"));
		String line=br.readLine();
		HashSet<String> h=new HashSet<String>();
		for(String s:line.split(",",-1))
			h.add(s);
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] words=input.split(" ",-1);
		for(String s1:words){
			if(h.contains(s1.toLowerCase()))
				input=input.replace(s1,"");
		}
		System.out.println(input);
		}catch(FileNotFoundException e){
			System.out.println("Unable to find the file");
		}catch(IOException e){
			System.out.println("Unable to read the file");
		}
	}
}