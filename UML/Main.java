package untitled55;

public class Main {

    public static void main(String[] args) {

Cylinder c = new Cylinder(2 ,"bleu" ,1) ;    // object c from class Cylinder
        System.out.println(c.getColor());           //get color of Cylinder
        c.setHeight(5);                             // set height of Cylinder
        System.out.println(c.getHeight());          // get height of Cylinder
        System.out.println(c.getVolume());         // get volume of Cylinder
        System.out.println(c.toString());           // print String

 Circle s = new Circle(2 ,"Black")   ;     // object c from class Circle
        System.out.println(s.getColor());           //get color of Circle
        System.out.println(s.getArea());         // get area of Circle
        System.out.println(s.toString());        // print String


    }
}
