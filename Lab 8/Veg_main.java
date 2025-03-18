
// The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. 
// Write a java program that demonstrates how to establish this class hierarchy. Declare 
// one instance variable of type String that indicates the color of a vegetable. Crete and 
// display instances of these objects. Override the toString() method of object to return a 
// string with the name of vegetable and its color. 

abstract class Vegetable {
    String color = "no color";
    // public abstract String toString();
}

class Potato extends Vegetable {
   
    String name = "potato";
    // String color = "skin";
    

    public String toString() {
        super.color ="skin";
        String str=this.name + " " + super.color;
        return str;
    }
}

class Brinjal extends Vegetable {
  
    String name = "brinjal";
   

    public String toString() {
        super.color = "green";
        return this.name + " " + this.color;
    }
}

class Tomato extends Vegetable {
   
    String name = "tomato";
   

    public String toString() {
        super.color = "red";
        return this.name + " " + super.color;
    }
}

public class Veg_main {
    public static void main(String[] args) {
        Potato v1 = new Potato();
        Brinjal v2 = new Brinjal();
        Tomato v3 = new Tomato();
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

    }
}
