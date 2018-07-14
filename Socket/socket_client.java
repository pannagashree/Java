import java.util.*;
import java.io.*;
import java.net.*;
class Client{
	private Socket soc=null;
	private DataInputStream in=null;
	private DataOutputStream out=null;

	public Client(String addr,int port){
		try{
			soc=new Socket(addr,port);
			System.out.println("Connected");
			in=new DataInputStream(System.in);
			out=new DataOutputStream(soc.getOutputStream());
		}catch(UnknownHostException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}
		String line="";
		// keep reading until "Over" is input
		while(!line.equals("over")){
			try{
			line=in.readLine();
			out.writeUTF(line);
			}catch(IOException e){
			System.out.println(e);
			}
		}
		try{
		in.close();
		out.close();
		soc.close();
		}catch(IOException e){
		System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Client c=new Client(args[0],Integer.parseInt(args[1]));
	}
}