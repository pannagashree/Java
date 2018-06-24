import java.util.*;
import java.io.*;
class FilePrefix{
	public static void main(String[] args) {
		try{
			BufferedReader br= new BufferedReader(new FileReader("prefix-urlfilter.txt"));
			ArrayList<String> arr=new ArrayList<String>();
			String line=null;
			while((line=br.readLine())!=null)
				arr.add(line);
			Scanner sc=new Scanner(System.in);
			String in=sc.nextLine();
			if(arr.contains(in.split("www",2)[0]))
				System.out.println("True");
			else
				System.out.println("False");
			}catch(FileNotFoundException e){
			System.out.println("Unable to find the file");
		}catch(IOException e){
			System.out.println("Unable to read the file");
		}
	}
}
