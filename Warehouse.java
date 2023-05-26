package shoppingCart;
import java.util.HashMap;

public class Warehouse {

	private final HashMap<String, Integer> products;

	public Warehouse() {
		this.products = new HashMap<>();
	}

	public void addProduct(Product product, int quantity) {
		int currentQuantity = products.getOrDefault(product.getName(), 0);
		products.put(product.getName(), currentQuantity + quantity);
	}

	public void deleteProduct(Product product, int quantity) {
		int currentQuantity = products.getOrDefault(product.getName(), 0);
		if (currentQuantity < quantity) {
			System.out.println("Failed to delete product from warehouse. Quantity not found");
		} else {
			products.put(product.getName(), currentQuantity - quantity);
			System.out.println(quantity + " " + product.getName() + "(s) deleted from warehouse");
		}
	}

	public void printAllProducts() {
		System.out.println("Products in warehouse and their quantities: ");
		for (String productName : products.keySet()) {
			System.out.println(productName + ": " + products.get(productName));
		}
	}

	public int getProductQuantity(Product product) {
		return products.getOrDefault(product.getName(), 0);
	}

}
