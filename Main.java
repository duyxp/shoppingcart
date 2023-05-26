package shoppingCart;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WarehouseDB warehouseDB = new WarehouseDB();

		while (true) {
			System.out.println("\nWhat would you like to do?\n");
			System.out.println("1. Create a new product.");
			System.out.println("2. Update existing product.");
			System.out.println("3. Delete product.");
			System.out.println("4. Get list of all products.");
			System.out.println("5. End");

			int option = scanner.nextInt();

			switch (option) {
				case 1:
					System.out.println("Please enter product name:");
					String name = scanner.next();
					System.out.println("Please enter product quantity:");
					int quantity = scanner.nextInt();
					System.out.println("Please enter product description:");
					String description = scanner.next();
					System.out.println("Please enter product price:");
					double price = scanner.nextDouble();
					System.out.println("Please enter product weight in lbs:");
					double weight = scanner.nextDouble();
					Products product = new Products(name, quantity, description, price, weight);
					warehouseDB.addProduct(product);
					System.out.println("");
					System.out.println("Added product to warehouse.");
					break;

				case 2:
					System.out.println("Enter product iD to update");
					int iDUpdate = scanner.nextInt();
					System.out.println("Enter new product name:");
					String newName = scanner.next();
					System.out.println("Enter new product quantity:");
					int newQuantity = scanner.nextInt();
					System.out.println("Enter new product description:");
					String newDescription = scanner.next();
					System.out.println("Enter new product price:");
					double newPrice = scanner.nextDouble();
					System.out.println("Enter new product weight in lbs:");
					double newWeight = scanner.nextDouble();
					//Products newProduct = new Products(newName, newQuantity, newDescription, newPrice, newWeight);
					warehouseDB.updateProduct(iDUpdate, newName, newPrice, newDescription, newQuantity, newWeight);
					System.out.println("Added product to warehouse.");
					break;

				case 3:
					System.out.println("Enter product iD to delete:");
					int iDDelete = scanner.nextInt();
					warehouseDB.deleteProduct(iDDelete);
					System.out.println("Delete product from warehouse.");
					break;
				case 4:
					warehouseDB.viewProducts();
					System.out.println("View products in warehouse.");
					break;
				case 5:
					System.out.println("Exiting program...");
					System.out.println(0);
					break;
				default:
					System.out.println("Invalid choice, try again.");
			}
		}
	}

}
