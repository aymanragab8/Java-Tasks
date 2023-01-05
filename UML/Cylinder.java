package untitled55;

public class Cylinder extends Circle {   // class Cylinder inherited from class Circle
    // Declaration an initialization of Variables
    private double height = 1 ;
    // constructors
    public Cylinder() {         // default constructor
    }

    public Cylinder(double height) {          // constructor with 1 parameter
        this.height = height;
    }

    public Cylinder(double radius, double height) {        // constructor with 1 parameter from Cylinder class + 1 parameter from Circle class
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {      // constructor with 1 parameter from Cylinder class + 2 parameters from Circle class
        super(radius, color);
        this.height = height;
    }
    // Methods
    public double getHeight() {             // height getter
        return height;
    }

    public void setHeight(double height) {       // height setter
        this.height = height;
    }

    @Override
    public String toString() {                  //override method
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
    public double getVolume (){           // method to get volume of cylinder

       return getArea()*height;
    }
}
