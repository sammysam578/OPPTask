public class Product {
    private String productName;
    private String productId;
    private double price;
    private int stockQuantity;

    
    public  Product(String productName, String productId, double price, int stockQuantity) {
        this.productName = productName;
        this.productId = productId;
        setPrice(price);  
        if (stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        } else {
            this.stockQuantity = 0;
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void purchase(int quantity) {
        if (quantity > 0 && quantity <= stockQuantity) {
            stockQuantity = stockQuantity - quantity;
            System.out.println(quantity + " items purchased.");
        } else {
            System.out.println("Not enough stock or invalid quantity.");
        }
    }
    public void restock(int quantity) {
        if (quantity > 0) {
            stockQuantity = stockQuantity + quantity;
            System.out.println(quantity + " items added to stock.");
        } else {
            System.out.println("Restock quantity must be positive.");
        }
    }

    public void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: $" + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }

    public static void main(String[] args) {
        Product p = new Product("Keyboard", "KBD123", 49.99, 10);
        p.display();

        p.purchase(3);
        p.restock(5);
        p.setPrice(-10);  
        p.setPrice(55);

        p.display();
    }
}


