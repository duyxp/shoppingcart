package shoppingCart;

public class Product {
    private String productName;
    private String productDetails;
    private double productPrice;


    
    public Product(String productName, String productDetails, double productPrice) {
        this.productName = productName;
        this.productDetails = productDetails;
        this.productPrice = productPrice;
    }

    
    public String getName() {
        return productName;
    }

    public String getDetails() {
        return productDetails;
    }

    public double getPrice() {
        return productPrice;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    public void setDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public void setPrice(double productPrice) {
        this.productPrice = productPrice;
    }

}

