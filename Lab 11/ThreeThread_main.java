// Write a java program that implements a multi-thread application that has 
// three threads. First thread generates random integer every 1 second and if 
// the value is even, second thread computes the square of the number and 
// prints. If the value is odd, the third thread will print the value of cube of 
// the number. 
class Thread1 extends Thread {
    public void run() {
        int num = (int) (Math.random() * 10);

        if (num % 2 == 0) {
            Even e1 = new Even(num);
            e1.start();
        } else {
            Odd o1 = new Odd(num);
            o1.start();
        }
    }
}

class Even extends Thread {
    int num;

    Even(int n) {
        num = n;
    }

    public void run() {
        System.out.println("Square of " + num + " is " + num * num);
    }
}

class Odd extends Thread {
    int num;

    Odd(int n) {
        num = n;
    }

    public void run() {
        System.out.println("Cube of " + num + " is " + num * num * num);
    }
}

public class ThreeThread_main {
    public static void main(String[] args) {
       Thread1 t1 = new Thread1();
       t1.start();
    }
}
