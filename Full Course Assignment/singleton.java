import java.util.*;
class Singleton{
	private static Singleton single;
	private Singleton(){}
	public static Singleton getInstance(){
		if(single==null){
			single=new Singleton();
			System.out.println("Instance created");
		}
		else
			System.out.println("Instance already exists");
		return single;
	}
}
class Main{
	public static void main(String[] args) {
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		//Singleton ob1=new Singleton();	/*Compile time Error*/
	}
}