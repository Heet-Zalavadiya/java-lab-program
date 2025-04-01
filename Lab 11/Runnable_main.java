class Runnable12 implements Runnable {
    public void run() {
        String n = "Heet Zalavadiya";
        try {

            for (int i = 0; i < n.length(); i++) {
                System.out.print(n.charAt(i));
                Thread.sleep(150);

            }
        } catch (Exception e) {
            System.out.println("Exception Caught");
        }
    }
}

public class Runnable_main {
    public static void main(String[] args) {
          Runnable12 r =new Runnable12();
          Thread t =new Thread(r);
          t.start();
    }
}
