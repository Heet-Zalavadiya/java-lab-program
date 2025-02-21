class Circle {
    double radius;

    public Circle(double radius){
          this.radius=radius;

    }
    public void Area(){
        double Area=3.14*radius*radius;
        System.out.println(Area);
    }
   
}

public class Circle1{
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        c1.Area();

    }
}
