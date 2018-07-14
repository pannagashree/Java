import java.util.*;
import java.io.*;
import java.net.*;
class Server{
	private Socket soc=null;
	private DataInputStream in=null;
	private ServerSocket server=null;

	public Server(int port){
		try{
			server=new ServerSocket(port);
			System.out.println("Server started");
			System.out.println("Waiting for client...");
			soc=server.accept();
			in=new DataInputStream(new BufferedInputStream(soc.getInputStream()));
		String line="";
		// keep reading until "Over" is input
		while(!line.equals("over")){
			try{
			line=in.readUTF();
			System.out.println(line);
			}catch(IOException e){
				System.out.println(e);
			}
		}
		System.out.println("Closing Connection");
		in.close();
		soc.close();
	}catch(IOException e){
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
		Server s=new Server(Integer.parseInt(args[0]));
	}
}