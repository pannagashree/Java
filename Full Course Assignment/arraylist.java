import java.util.*;
import java.lang.reflect.*;
class Arraylist<T>{
	private int n;
	private final int maxsize=10;
	private final Class<T> type;
	private T[] array;
	int size;
	Arraylist(Class<T> type){
		n=maxsize;
		this.type=type;
		size=0;
		array=(T[]) java.lang.reflect.Array.newInstance(type,n);
	}
	Arraylist(Class<T> type,int n){
		this.n=n;
		this.type=type;
		size=0;
		array=(T[]) java.lang.reflect.Array.newInstance(type,n);
	}
	private void resize(Class<T> type){
		T[] newarray=(T[]) java.lang.reflect.Array.newInstance(type,array.length*2);
		for(int i=0;i<array.length;i++)
			newarray[i]=array[i];
		array=newarray;
	}
	void add(T ele){
		if(size==n){
			resize(this.type);
		}
		array[size++]=ele;
	}
	T get(int i){
		return array[i];
	}
	int size(){
		return this.size;
	}
	void remove(int i){
		for(int j=i+1;j<array.length;j++){
			array[j-1]=array[j];
		}
		size-=1;
	}
}
class ArraylistTest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Arraylist<Integer> obj=new Arraylist(Integer.class,5);
		for(int i=0;i<5;i++){
			obj.add(sc.nextInt());
		}
		obj.add(90);
		System.out.println(obj.size());
		obj.remove(4);
		for(int i=0;i<obj.size();i++)
			System.out.printf("%d ",obj.get(i));
	}
}