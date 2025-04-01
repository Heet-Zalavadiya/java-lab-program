// Write a program to create two threads, one thread will print odd numbers and second 
// thread will print even numbers between 1 to 20 numbers.
class odd extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    continue;
                } else {
                    System.out.print(i + " ");
                    Thread.sleep(100);
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception catched");
        }

    }
}

class even extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.print(i +" ");
                    Thread.sleep(150);
                } else {
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception catched");
        }
    }
}

public class oddeven_main {
    public static void main(String[] args) {
        odd o = new odd();
        System.out.println("Odd number between 1 to 20");
        // o.start();
        o.run();
        even e = new even();
        System.out.println("\nEven number between 1 to 20");
        // e.start();
        e.run();

    }
}
