class Parent {
    public void display() {
        System.out.println("Parent");
    }         
}
class Child extends Parent {    
    public void display() {
        System.out.println("Derived");
    }
}
class Test{
    public static void doDisplay( Parent o ) {
        o.display();   
    }

    public static void main(String[] args) {
        Parent x = new Parent();
        Parent y = new Child();
        Child z = new Child();
        doDisplay(x);
        doDisplay(y);
        doDisplay(z);
    }
}