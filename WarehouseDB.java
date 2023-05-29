package shoppingCart;
import java.util.ArrayList;


public class WarehouseDB {
	private int newProductId;
    private ArrayList<Products> products = new ArrayList<Products>();

    
    public WarehouseDB() {
        this.newProductId = 0;
    }

    
    public int getId() {
        return newProductId;
    }


    public void setId(int newProductId) {
        this.newProductId = newProductId;
    }

   
    public void addProduct(Products product) {
        products.add(product);
        newProductId++;
        System.out.println("Creating new product...");
    }

    public void deleteProduct(int productId) {
        for (Products p : products) {
            if (getId() == productId) {
                products.remove(p);
                System.out.println("Deleted " + p.getName() + " from warehouse.");
                return;
            }
        }
        System.out.println("Product not found in warehouse.");
    }

   
    public void updateProduct(int id, String name, double price, String details, int quantity, double weight) {
        for (Products p : products) {
            if (getId() == id) {
                p.setName(name);
                p.setPrice(price);
                p.setDescription(details);
                p.setQuantity(quantity);
                p.setWeightInLbs(weight);
                System.out.println("Updated " + p.getName() + " in warehouse.");
                return;
            }
        }
        System.out.println("Product not found in warehouse.");
    }



    public void viewProducts() {
        System.out.println("Warehouse products:");
        for (Products p : products) {
            System.out.println("ID: " + getId() + ", Name: " + p.getName() + ", Price: $" + p.getPrice() + ", Description: " + p.getDescription() + ", Quantity: " + p.getQuantity() + ", Weight: " + p.getWeightInLbs() + " lbs");
        }
    }
}

