package shoppingCart;

public class Products {

	    private String name;
	    private int quantity;
	    private String description;
	    private double price;
	    private double weightInLbs;

		//constructor
	    public Products(String name, int quantity, String description, double price, double weightInLbs) {
	        this.name = name;
	        this.quantity = quantity;
	        this.description = description;
	        this.price = price;
	        this.weightInLbs = weightInLbs;
	    }

		//getters and setters
	    public String getName() {
	        return name;
	    }

		public int getQuantity() {
			return quantity;
		}

		public String getDescription() {
			return description;
		}

		public double getPrice() {
			return price;
		}

		public double getWeightInLbs() {
			return weightInLbs;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setWeightInLbs(double weightInLbs) {
			this.weightInLbs = weightInLbs;
		}


	}


