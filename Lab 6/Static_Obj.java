class ObjCount{
    static int objcount=0;
    public ObjCount(){
        objcount++;
        
    }
    public void displaycount(){
        System.out.println(objcount);
    }
}

public class Static_Obj {
    public static void main(String[] args) {
        ObjCount obj1 = new ObjCount();
        ObjCount obj2 = new ObjCount();
        ObjCount obj3 = new ObjCount();
        ObjCount obj4 = new ObjCount();
        obj1.displaycount();
        obj2.displaycount();
        obj3.displaycount();
        obj4.displaycount();
        
    }
}
