package MyOnlineShop;

public class Main {

    public static void main(String[] args) {
book b = new book("In The Sea" ,370,70 ,"adventurs" ,300);       // an object b from class book
        System.out.println(b.toString());
        System.out.println("***************************************************************");
        childrenbook c = new childrenbook("Travlling" ,50,30 ,"Cartoon" ,70,"red");       // an object c from class childrenbook
        System.out.println(c.toString());
        System.out.println("***************************************************************");
        System.out.println("some of products with prices : ");

product d[]=new product[5];                                      // array of product

        for (int i = 0 ; i <d.length ; i ++) {
            d[0] = new product("Tea", 35);
            d[1] = new product("Meat", 150);
            d[2] = new product("Water", 5);
            d[3] = new product("Shirt", 100);
            d[4] = new product("Bananas", 10);
            System.out.println(d[i].toString());

        }
        System.out.println("All prices = " + (d[0].price+d[1].price+d[2].price+d[3].price+d[4].price));    // total prices of products
    }
}
