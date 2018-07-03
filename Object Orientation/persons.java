class Person{
private String name;
private	int ph_no;
private	String address;
private	String email;
Person(String nm){
		name=nm;
	}
public String getName(){
		return this.name;
	}
public String toString(){
		return this.getClass().getName()+" "+this.name;
	}
}
class Student extends Person{
private final String status=null;
Student(String n){
	super(n);
}
public String toString(){
		return this.getClass().getName()+" "+this.getName();
	}
}
class Employee extends Person{
private String office;
private double salary;
private String hire_date;
Employee(String n){
	super(n);
}
public String toString(){
		return this.getClass().getName()+" "+this.getName();
	}
}
class Faculty extends Employee{
private int office_hours;
private int rank;
Faculty(String n){
	super(n);
}
public String toString(){
		return this.getClass().getName()+" "+this.getName();
	}
}
class Staff extends Employee{
private	String title;
Staff(String n){
	super(n);
}
public String toString(){
		return this.getClass().getName()+" "+this.getName();
	}
}
class TestPerson{
	public static void main(String[] args) {
		Person obj1=new Person("A");
		Student obj2= new Student("B");
		Employee obj3=new Employee("C");
		Faculty obj4=new Faculty("D");
		Staff obj5=new Staff("E");
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		System.out.println(obj4.toString());
		System.out.println(obj5.toString());
	}
}