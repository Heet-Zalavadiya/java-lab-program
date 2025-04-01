// Write an application that executes two threads. One thread displays "Good Morning" 
// every 1000 milliseconds & another thread displays "Good Afternoon" every 3000 
// milliseconds. Create the threads by implementing the Runnable interface.

class Display1 implements Runnable{
        public void run(){
            String n = "Good morning";
            try{
                for(int i=0;i<n.length(); i++){
                    System.out.print(n.charAt(i));
                    Thread.sleep(100);
                }
            }catch(Exception e){
                System.out.println("Exception caught");
            }
        }
}

class Display2 implements Runnable{
    public void run(){
        String n = "Good afternoon";
        try{
            for(int i=0;i<n.length(); i++){
                System.out.print(n.charAt(i));
                Thread.sleep(300);
            }
        }catch(Exception e){
            System.out.println("Exception caught");
        }
    }
}

public class Application_main {
    public static void main(String[] args){
        Display1 d1 = new Display1();
        Display2 d2 = new Display2();
        Thread t1 = new Thread(d1);
        // t1.start(); //GGood morningg
        t1.run();
        Thread t2 = new Thread(d2);
        // t2.start();
        t2.run();
    }
}
