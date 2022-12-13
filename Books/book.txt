package MyOnlineShop;

public class book extends product{
    // Declaration an initialization of Variables
  int number_of_pages ;
    // constructors
    public book() {                    // default constructor
    }

    public book(int number_of_pages) {         // constructor with 1 parameter
        this.number_of_pages = number_of_pages;
    }

    public book(String name, double price, double volume, String type, int number_of_pages) {       // constructor with 1 parameter from book class + 4 parameters from product class
        super(name, price, volume, type);
        this.number_of_pages = number_of_pages;
    }
    // Methods
    public int getNumber_of_pages() {                      // number of pages getter
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {            // number of pages setter
        this.number_of_pages = number_of_pages;
    }
    @Override
    public double getPrice (){                // override method to get price
        return price*.5 ;
    }

    @Override
    public String toString() {
        return "book{" +
                "number_of_pages=" + number_of_pages +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}
