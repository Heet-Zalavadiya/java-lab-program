class A{
    final int a = 10;
    void display(){
        System.out.println(a);
    }
}
class B extends A{
    final void display(){
        System.out.println("This is a final method.");
    }
}
final class C extends B{
    void display(){
        System.out.println("This is an overridden method.");
    }
}
class D extends C{
    void display(){
        System.out.println("This is an overridden method.");
    }
}

public class Final_main {
    public static void main(String[] args){
       A a = new A();
       a.a = 20;
       a.display();
       B b = new B();
       b.display();
       C c = new C();
       c.display();
       D d = new D();
       d.display();

    }
}
