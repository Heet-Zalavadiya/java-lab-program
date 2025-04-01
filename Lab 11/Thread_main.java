class Thread12 extends Thread {
    public void run() {
        try {

            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

public class Thread_main {
    public static void main(String[] args) {
          Thread12 t1 = new Thread12();
          t1.start();
    }
}