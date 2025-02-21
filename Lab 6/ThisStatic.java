class static_this {
    static int a = 10;

    public static_this(int a) {
        static_this.a = a;
        //this.a = a; do not use for static keyword but will work
        
    }
    public void displayint(){
        System.out.println(a);
    }
}

public class ThisStatic {
    public static void main(String[] args) {
         static_this st = new static_this(25);
         st.displayint();
    }
}
