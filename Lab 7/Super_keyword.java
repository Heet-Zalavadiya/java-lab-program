class A{
    int a = 10;
    A(int a){
        this.a =a;
    }
}
class B extends A{
    int a = 11;
   
    B(int a){
        this.a =a;
    }
    System.out.println(this.a + " " +super.a);
}








public class Super_keyword {
    public static void main(String[] args) {
        
    }
}
