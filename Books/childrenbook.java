package MyOnlineShop;

public class childrenbook extends book{
    String color ;
    // Declaration an initialization of Variables
    public childrenbook() {                            // default constructor
    }

    public childrenbook(String color) {                // constructor with 1 parameter
        this.color = color;
    }
    // constructor with 1 parameter from childrenbook class + 5 parameters from product and book classes
    public childrenbook(String name, double price, double volume, String type, int number_of_pages, String color) {
        super(name, price, volume, type, number_of_pages);
        this.color = color;
    }
// methods
    public String getColor() {                 // color getter
        return color;
    }

    public void setColor(String color) {         // color setter
        this.color = color;
    }

    @Override
    public double getPrice (){                  // override method to get price
        return price*.7 ;
    }

    @Override
    public String toString() {
        return "childrenbook{" +
                "number_of_pages=" + number_of_pages +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}
