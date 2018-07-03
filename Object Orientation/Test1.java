class SuperClass {
    protected void foo() {}
}
class Child extends SuperClass {
    void foo() {}
}
public class Test1 {
    public static void main(String args[]) {
        Child child = new Child();
        child.foo();
    }
}

/*Solution*/
/*
class SuperClass {
    protected void foo() {System.out.println("hello");}
}
class Child extends SuperClass {
    protected void foo() {System.out.println("hai");}
}
public class Test1 {
    public static void main(String args[]) {
        Child child = new Child();
        child.foo();
    }
}*/