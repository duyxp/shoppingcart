package shoppingCart;
import java.util.ArrayList;

public class ShoppingCart {
	private double salesTax = 0.1;
	private float subTotal = 0;
	private int productQuantity = 0;
	private String shoppingCartName = "MiddleEarth Mart";
	private ArrayList<Product> products = new ArrayList<Product>();

	public ShoppingCart(String name) {
		subTotal = 0;
		salesTax = 0;
		productQuantity = 0;
		shoppingCartName = name;
	}

	// add product to cart
	public void addProduct(Product product) {
		products.add(product);
		productQuantity++;
		subTotal += product.getPrice();
		salesTax = subTotal * 0.1;
		System.out.println("Added " + product.getName() + " to cart. Current subtotal: $" + subTotal);
	}

	// delete product by product name
	public void deleteProduct(String productName) {
		for (Product p : products) {
			if (p.getName().equals(productName)) {
				products.remove(p);
				productQuantity --;
				subTotal -= p.getPrice();
				salesTax = subTotal * 0.1;
				System.out.println("Deleted " + p.getName() + " from cart. Current subtotal: $" + subTotal);
				return;
			}
		}
		System.out.println(productName + " not found in cart.");
	}

	// edit product quantity
	public void editProductQuantity(Product product, int quantity) {
		if (products.contains(product)) {
			if (quantity > 5) {
				System.out.println("Quantity cannot exceed 5.");
				return;
			}
			int index = products.indexOf(product);
			Product p = products.get(index);
			subTotal -= p.getPrice();
			productQuantity --;
			productQuantity += quantity;
			subTotal += p.getPrice() * quantity;
			salesTax = subTotal * 0.1;
			System.out.println(
					"Updated " + product.getName() + " quantity to " + quantity + ". Current subtotal: $" + subTotal);
		} else {
			System.out.println(product.getName() + " not found in cart.");
		}
	}

	public void printDetails() {
		System.out.println("Shopping Cart: " + shoppingCartName);
		System.out.println("Total items: " + productQuantity);
		System.out.println("Subtotal: $" + subTotal);
		System.out.println("Sales Tax: $" + salesTax);
		System.out.println("Total: $" + (subTotal + salesTax));
	}

}
