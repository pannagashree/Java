import java.util.*;
import java.io.*;
class FileRead{
	public static void main(String[] args) {
		try{
		BufferedReader br= new BufferedReader(new FileReader("input.txt"));
		ArrayList<String> arr=new ArrayList<String>();
		String line=null;
		while((line=br.readLine())!=null)
			if(line.startsWith("#"))
				continue;
			else
				arr.add(line);
		for(int i=0;i<arr.size();i++)
			System.out.println(arr.get(i));
		}catch(FileNotFoundException e){
			System.out.println("Unable to find the file");
		}catch(IOException e){
			System.out.println("Unable to read the file");
		}
	}
}