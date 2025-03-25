interface Playble {
    void play();
}
class Football implements Playble{
    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("play football");
    }
}
class Volleyball implements Playble{
    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("play Volleyball");
    }
}
class Basketball implements Playble{
    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("play Basketball");
    }
}

public class Playble_main{
    public static void main(String [] args){
       Playble p = new Basketball();
       p.play();
       Playble p1 = new Football();
       p1.play();
       Playble p2 = new Volleyball();
       p2.play();
    }
}