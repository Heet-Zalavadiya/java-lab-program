// Write a program that illustrates interface inheritance. Interface A is extended by A1 and 
// A2. Interface A12 inherits from both A1 and A2.Each interface declares one constant 
// and one method. Class B implements A12.Instantiate B and invoke each of its methods. 
// Each method displays one of the constants.
interface A {
    int a = 10;

    int display();
}

interface A1 extends A {
    int b = 11;

    int displayA1();
}

interface A2 extends A {
    int c = 12;

    int displayA2();
}

interface A12 extends A1, A2 {
    int d = 13;

    int displayA12();
}

class B implements A12 {
    int e = 14;

    public int display() {
        return a;
    }

    public int displayA1() {
        return b;
    }

    public int displayA2() {
        return c;
    }

    public int displayA12() {
        return d;
    }

    int displayB(){
        return e;
    }
}

public class A_main {
    public static void main(String[] args) {
        B b = new B();
       System.out.println(b.display()); 
       System.out.println(b.displayA1()); 
       System.out.println(b.displayA12()); 
       System.out.println( b.displayA2());
       System.out.println(b.displayB()); 
    }
}
