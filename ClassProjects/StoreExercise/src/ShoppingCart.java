import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> products;

    public ShoppingCart(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    //User adds a Product object to their cart.
    public void addItem(Product product, Product[] productsAvailable, int[] inventory) {
        products.add(product);
        int index;
        for (int i = 0; i < productsAvailable.length; i++) {
            if (productsAvailable[i].equals(product)) {
                index = i;
                inventory[index] -= 1;
            }
        }
    }

    //User removes a Product object to their cart.
    public void removeItem(Product product, Product[] productsAvailable, int[] inventory) {
        products.remove(product);

        for (int i = 0; i < productsAvailable.length; i++) {
            if (productsAvailable[i].equals(product)) {
                inventory[i] += 1;
            }
        }
    }

    public void viewShoppingCart() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }

    public void checkOut() {
        double total = 0.0;

        for(int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice();
        }

        DecimalFormat df = new DecimalFormat(".##");
        System.out.println("Total cost: $" + df.format(total));
    }
}
