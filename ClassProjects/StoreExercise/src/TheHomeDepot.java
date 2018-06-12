import java.util.ArrayList;

public class TheHomeDepot {
    public static void main(String[] args){

        ArrayList<Product> placeholder = new ArrayList<Product>();
        placeholder.add(new Product("Shipping","",0));
        ShoppingCart myCart = new ShoppingCart(placeholder);

        //Black&Decker Vendor Products
        Product hammer = new Product ("Hammer", "Heavy metal head and plastic handle.", 7);
        Product drill = new Product ("Drill", "An electrical tool with a metal component.", 29.99);
        Product flathead = new Product ("Flat Head Screw Driver", "Tool used with a flat head.", 4.99);
        Product philipshead = new Product ("Philips Head Screw Driver", "Tool with star shaped head.", 4.99);
        Product ruler = new Product ("Ruler", "Measurement tool.", 2.99);
        //Craftsmen Products
        Product nut = new Product ("nut", "cylindrical device", .50);
        Product bolt = new Product ("bolt", "elongated iron for tightening", .75);
        Product screw = new Product ("screw", "spiral piece of iron for tightening", .20);
        Product washer = new Product ("washer", "circular piece of metal for fastening", .60);
        Product gasket = new Product ("gasket", "rubber item used for water proofing", .55);
        //John Deer Products
        Product trailer = new Product ("Trailer", "Empty space object used for storage", 500.00);
        Product pushLawnMower = new Product ("Push Lawn Mower", "Grass cutting device", 675.00);
        Product weedWacker = new Product ("Weed Wacker", "Battery operated device  for trimming", 67.00);
        Product shrubTrimmer = new Product ("Scrub Trimmer", "Device used to trim scrubs", 90.00);
        Product rake = new Product ("Rake", "Plastic or metal tool for collecting debris", 34.00);

//        Vendor Black_Decker = new Vendor ("Black & Decker", )

        //Product Array
        Product productsAvailable [] = new Product[15];

        productsAvailable [0] = hammer;
        productsAvailable [1] = drill;
        productsAvailable [2] = flathead;
        productsAvailable [3] = philipshead;
        productsAvailable [4] = ruler;
        productsAvailable [5] = nut;
        productsAvailable [6] = bolt;
        productsAvailable [7] = screw;
        productsAvailable [8] = washer;
        productsAvailable [9] = gasket;
        productsAvailable [10] = trailer;
        productsAvailable [11] = pushLawnMower;
        productsAvailable [12] = weedWacker;
        productsAvailable [13] = shrubTrimmer;
        productsAvailable [14] = rake;

        //inventory array to assign quantities
        int inventory [] = new int [15];

        inventory [0] = 5;
        inventory [1] = 3;
        inventory [2] = 0;
        inventory [3] = 0;
        inventory [4] = 0;
        inventory [5] = 0;
        inventory [6] = 0;
        inventory [7] = 0;
        inventory [8] = 0;
        inventory [9] = 0;
        inventory [10] = 0;
        inventory [11] = 0;
        inventory [12] = 0;
        inventory [13] = 0;
        inventory [14] = 0;

       // Vendor 1 has the below 5 products. This array sets up the products.
//        Product vendor1 [] = new Product [5];
//
//        vendor1 [0] = hammer;
//        vendor1 [1] = drill;
//        vendor1 [2] = flathead;
//        vendor1 [3] = philipshead;
//        vendor1 [4] = ruler;
//
//        //Vendor 2 array of products.
//        Product vendor2 [] = new Product [5];
//        vendor2 [0] = nut;
//        vendor2 [1] = bolt;
//        vendor2 [2] = screw;
//        vendor2 [3] = washer;
//        vendor2 [4] = gasket;
//
//        //Vendor 3 array of products.
//        Product vendor3 [] = new Product [5];
//        vendor3 [0] = trailer;
//        vendor3 [1] = pushLawnMower;
//        vendor3 [2] = weedWacker;
//        vendor3 [3] = shrubTrimmer;
//        vendor3 [4] = rake;

    //View the Items available in the store.
        System.out.println("---------------------------------");
        System.out.println("These items are available to add to your cart:");
        System.out.println("");
        for ( int i = 0; i < productsAvailable.length; i++){
        System.out.println(productsAvailable[i].getName() + " costs $" + productsAvailable[i].getPrice() + ".");
    }
        System.out.println("---------------------------------");

    //Add hammer to shopping cart.
        myCart.addItem(hammer, productsAvailable, inventory);
    //Add hammer to shopping cart.
        myCart.addItem(hammer, productsAvailable, inventory);
    //Add drill to shopping cart.
        myCart.addItem(drill, productsAvailable, inventory);
//
//     //View items shopping cart.
        System.out.println("These items are currently in your cart:");
        myCart.viewShoppingCart();

//        //myCart.viewShoppingCart();
        System.out.println("---------------------------------");
//
        //Remove hammer from shopping cart.
        myCart.removeItem(hammer, productsAvailable, inventory);
//
       //View items shopping cart.
        System.out.println("Your cart has been updated:");
        myCart.viewShoppingCart();

//      System.out.println("---------------------------------");

        //testing the remaining inventory for drills.
        System.out.println(inventory[1]);

        //Checkout
        myCart.checkOut();
////
















    }
}
