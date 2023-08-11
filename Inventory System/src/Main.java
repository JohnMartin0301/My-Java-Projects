import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;
    private int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getters and setters for the Product class
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: $" + price + ", Stock: " + stock;
    }
}

class InventorySystem {
    private List<Product> products;

    public InventorySystem() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProductStock(int productId, int newStock) {
        Product product = findProductById(productId);
        if (product != null) {
            product.setStock(newStock);
        }
    }

    public Product findProductById(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }

    public void generateInventoryReport() {
        System.out.println("Inventory Report:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventorySystem inventorySystem = new InventorySystem();

        // Menu loop
        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Update Stock");
            System.out.println("3. Search Product");
            System.out.println("4. Generate Inventory Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add Product
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Initial Stock: ");
                    int stock = scanner.nextInt();
                    Product newProduct = new Product(id, name, price, stock);
                    inventorySystem.addProduct(newProduct);
                    break;
                case 2:
                    // Update Stock
                    System.out.print("Enter Product ID: ");
                    int productId = scanner.nextInt();
                    System.out.print("Enter New Stock: ");
                    int newStock = scanner.nextInt();
                    inventorySystem.updateProductStock(productId, newStock);
                    break;
                case 3:
                    // Search Product
                    System.out.print("Enter Product ID: ");
                    int searchId = scanner.nextInt();
                    Product searchedProduct = inventorySystem.findProductById(searchId);
                    if (searchedProduct != null) {
                        System.out.println("Found Product: " + searchedProduct);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    // Generate Inventory Report
                    inventorySystem.generateInventoryReport();
                    break;
                case 5:
                    // Exit
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}