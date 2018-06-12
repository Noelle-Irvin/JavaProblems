public class Vendor {

    private String vendorName;
    private int quantity;
    public Product[] productsAvailable;
    public int [] inventory;

    public Vendor(String vendorName, Product [] productsAvailable, int [] inventory) {
        this.vendorName = vendorName;
        this.productsAvailable = productsAvailable;
        this.inventory = inventory;
    }

//    public int itemsAvailable (String nameOfItem) {
//
//    }

//    public int setQuantity(int customerQuantity) {
//        int newQuantity = quantity /*5 */ - customerQuantity; //2
//        this.quantity = newQuantity;
//        return quantity; //3
//    }
}
