import java.util.*;
import java.lang.*;
class MyStack{
	private ArrayList<Object> stack= new ArrayList<Object>();
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	public int getSize(){
		return stack.size();
	}
	public Object peek(){
		return stack.get(getSize()-1);
	}
	public Object pop(){
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return null;
		}
		else
		{
			Object o=stack.get(getSize()-1);
			stack.remove(o);
			return o;
		}
	}
	public void push(Object o){
		stack.add(o);
	}
	public String toString(){
		return "Stack="+stack.toString();
	}
}
class Test{
	public static void main(String[] args) {
		MyStack obj=new MyStack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice");
		while(true)
		{
			System.out.println("Enter 1 to push,2 to pop,3 to peek and 4 to exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:System.out.println("Enter the element to be pushed:");
						int ele=sc.nextInt();
						obj.push(ele);
						break;
				case 2:System.out.println("The element popped is"+obj.pop());
						break;
				case 3:System.out.println("The element at the top is "+obj.peek());
						break;
				case 4:System.exit(0);
			}
		}
	}
}