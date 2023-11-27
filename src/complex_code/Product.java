package complex_code;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Class representing a product
public class Product {
    private String name;
    private double price;

    // Constructor to initialize product with name and price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter method for product name
    public String getName() {
        return name;
    }

    // Getter method for product price
    public double getPrice() {
        return price;
    }

    // Override toString method for better printing
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

// Class representing an inventory management system
class InventoryManagementSystem {
    private List<Product> products;             // List to store products
    private Map<Product, Integer> inventory;    // HashMap to store product quantities

    // Constructor to initialize lists and map
    public InventoryManagementSystem() {
        products = new ArrayList<>();
        inventory = new HashMap<>();
    }

    // Method to add a product to the inventory with a specified quantity
    public void addProduct(Product product, int quantity) {
        products.add(product);
        inventory.put(product, quantity);
    }

    // Method to display the current state of the inventory
    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : products) {
            int quantity = inventory.get(product);
            System.out.println(product + ", Quantity: " + quantity);
        }
    }

    // Main method to demonstrate the inventory management system
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        // Adding products to the inventory
        ims.addProduct(new Product("Laptop", 999.99), 10);
        ims.addProduct(new Product("Smartphone", 499.99), 20);
        ims.addProduct(new Product("Headphones", 49.99), 30);

        // Displaying the initial inventory
        ims.displayInventory();

        // Simulating a purchase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name to purchase:");
        String productName = scanner.nextLine();

        Product selectedProduct = null;
        for (Product product : ims.products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                selectedProduct = product;
                break;
            }
        }

        if (selectedProduct != null) {
            System.out.println("Enter the quantity to purchase:");
            int quantityToPurchase = scanner.nextInt();

            int availableQuantity = ims.inventory.get(selectedProduct);
            if (quantityToPurchase <= availableQuantity) {
                System.out.println("Purchase successful!");
                ims.inventory.put(selectedProduct, availableQuantity - quantityToPurchase);
            } else {
                System.out.println("Not enough stock available.");
            }
        } else {
            System.out.println("Product not found.");
        }

        // Displaying the updated inventory
        ims.displayInventory();

        scanner.close();
    }
}