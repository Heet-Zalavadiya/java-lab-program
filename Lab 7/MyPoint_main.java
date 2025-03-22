//  Design a class named MyPoint to represent a point with x- and y-coordinates. The 
// class contains: 
// The data fields x and y that represent the coordinates with getter methods. 
// 1. a no-arg constructor that creates a point (0, 0). 
// 2. a constructor that constructs a point with specified coordinates. 
// 3. a method named distance that returns the distance from this point to a specified 
// point of the MyPoint type. 
// 4. a method named distance that returns the distance from this point to another point 
// with specified x- and y-coordinates.Create a class named ThreeDPoint to model a 
// point in a three-dimensional space. Let ThreeDPoint be derived from MyPoint with 
// following additional features: 
// 1. A data fields named z that represents the z-coordinate. 
// 2.    A no-arg constructor that creates a point (0, 0, 0). 
// 3.   A constructor that constructs a point with three specified coordinates. 
// 4.   A get method that returns the z value. 
// 5.   Override the distance method to return the distance between two points in the 
// three-dimensional space. Write a program that creates two points (0, 0, 0) and (10, 
// 30, 25.5) and display the distance between the two points.

class MyPoint {
    short x;
    short y;

    MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    MyPoint(short x, short y) {
        this.x = x;
        this.y = y;
    }
    double distance(MyPoint p){
        double ans = Math.sqrt(Math.pow(x-p.x,2)+Math.pow(y-p.y, 2));
        return ans;
    }
}
class ThreeDPoint extends MyPoint{
    short z;
    ThreeDPoint(){
        super();
        this.z = 0;
    }
    ThreeDPoint(short x,short y,short z){
        super(x,y);
        this.z = z;
    }
    double distance(ThreeDPoint p){
        double ans = Math.sqrt(Math.pow(x-p.x,2)+Math.pow(y-p.y, 2)+Math.pow(z-p.z, 2));
        return ans;
    }
}
public class MyPoint_main {
    public static void main(String[] args) {
        ThreeDPoint p1 = new ThreeDPoint((short)0,(short)0,(short)0);
        ThreeDPoint p2 = new ThreeDPoint((short)10,(short)30,(short)25);
        System.out.println("Distance between p1 and p2 is: "+p1.distance(p2));

    }
}
