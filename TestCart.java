package shoppingCart;

import java.util.Scanner;

public class TestCart {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ShoppingCart shoppingCart = new ShoppingCart("My Shopping Cart");

		Warehouse warehouse = new Warehouse();

		
		while (true) {
			System.out.println("\nAre you a customer or admin?");
			System.out.println("Enter your role(customer/admin): ");
			String role = scanner.next();

			if (role.equalsIgnoreCase("customer")) {
				while (true) {
					System.out.println("\n1. Show subtotal balance");
					System.out.println("2. Add product");
					System.out.println("3. Delete product");
					System.out.println("4. Exit program ");

					int option = scanner.nextInt();

					switch (option) {
						case 1:
							shoppingCart.printDetails();
							break;
						case 2:
							System.out.println("Enter product name: ");
							String name = scanner.next();
							System.out.println("Enter product details: ");
							String details = scanner.next();
							System.out.println("Enter product price");
							double price = scanner.nextDouble();
							Product product = new Product(name, details, price);
							shoppingCart.addProduct(product);
							break;
						case 3:
							// delete product
							System.out.println("Enter product name: ");
							String productName = scanner.next();
							shoppingCart.deleteProduct(productName);
							break;
						case 4:
							System.out.println("Exit program.");
							System.exit(0);
							break;
						default:
							System.out.println("Invalid option. Try again.");
							break;
					}
				}
			} else if (role.equalsIgnoreCase("admin")) {
				// add product quantity
				System.out.println("Enter product name: ");
				String productName = scanner.next();
				System.out.println("Enter product quantity: ");
				int ProductQuantity = scanner.nextInt();
				Product addedProduct = new Product(productName, "", 0);
				warehouse.addProduct(addedProduct, ProductQuantity);
				System.out.println("Added product to warehouse. ");
				continue;
			} else {
				System.out.println("Invalid role. Try again.");
				continue;
			}
		}

	}
}
