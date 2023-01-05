package untitled55;

public class Circle {
// Declaration an intialization of Variables
    private double radius  ;
    private String color = "red" ;
// constructors
    public Circle(){}  // default constructor

    public Circle(double radius) {    // constructor with 1 parameter
        this.radius = radius;
    }

    public Circle(double radius, String color) {      // constructor with 2 parameters
        this.radius = radius;
        this.color = color;
    }
// Methods
    public double getRadius() {             // radius getter
        return radius;
    }

    public void setRadius(double radius) {    // radius setter
        this.radius = radius;
    }

    public String getColor() {       // color getter
        return color;
    }

    public void setColor(String color) {          // color setter
        this.color = color;
    }

    @Override
    public String toString() {         // toString method
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    public double getArea (){           // method to get area of circle
        return 3.14*radius*radius ;
    }

}

