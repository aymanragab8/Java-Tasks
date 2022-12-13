package MyOnlineShop;

public class product {
    // Declaration an initialization of Variables
    String name;
    double price;
    double volume ;
    String type ;
    // constructors
    public product() {}            // default constructor

    public product(String name) {        // constructor with 1 parameter
        this.name = name;
    }

    public product(String name, double price) {            // constructor with 2 parameter
        this.name = name;
        this.price = price;
    }

    public product(String name, double price, double volume) {          // constructor with 3 parameter
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public product(String name, double price, double volume, String tybe) {            // constructor with 4 parameter
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.type = tybe;
    }
    // Methods
    public String getName() {                  // name getter
        return name;
    }

    public void setName(String name) {          // name setter
        this.name = name;
    }

    public double getPrice() {             // price getter
        return price;
    }

    public void setPrice(double price) {        // price setter
        this.price = price;
    }

    public double getVolume() {            // volume getter
        return volume;
    }

    public void setVolume(double volume) {           // volume setter
        this.volume = volume;
    }

    public String getType() {             // type getter
        return type;
    }

    public void setType(String type) {      // type setter
        this.type = type;
    }

    @Override
    public String toString() {
        return "product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
