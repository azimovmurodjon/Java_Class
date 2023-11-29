package complex_code;

import java.util.ArrayList;
import java.util.List;

/*
Explanation:

Import Statements: Import necessary classes from the Java standard library.

Product Class: Define a simple Product class with a name and price, along with getter methods.

ShoppingCart Class: Define a ShoppingCart class that uses an ArrayList to store products. It has methods to add products and calculate the total price.

Main Class (ShoppingCartExample): In the main method, create instances of products (laptop, smartphone, headphones) and a shopping cart.

Add Products to Cart: Use the addProduct method to add products to the shopping cart.

Calculate Total: Use the calculateTotal method to calculate and print the total price of items in the cart.
 */

// Define a class to represent a product
class Product {
    private String name;
    private double price;

    // Constructor to initialize product name and price
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
}

// Define a ShoppingCart class that uses an ArrayList to store products
class ShoppingCart {
    private List<Product> cartItems;

    // Constructor to initialize the ArrayList
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add a product to the shopping cart
    public void addProduct(Product product) {
        cartItems.add(product);
    }

    // Method to calculate the total price of the items in the cart
    public double calculateTotal() {
        double total = 0.0;

        // Loop through each product in the cart and accumulate the total price
        for (Product product : cartItems) {
            total += product.getPrice();
        }

        return total;
    }
}

 class ShoppingCartExample {
    public static void main(String[] args) {
        // Create some product instances
        Product laptop = new Product("Laptop", 999.99);
        Product smartphone = new Product("Smartphone", 499.99);
        Product headphones = new Product("Headphones", 79.99);

        // Create a ShoppingCart instance
        ShoppingCart cart = new ShoppingCart();

        // Add products to the shopping cart
        cart.addProduct(laptop);
        cart.addProduct(smartphone);
        cart.addProduct(headphones);

        // Calculate and print the total price of items in the cart
        double total = cart.calculateTotal();
        System.out.println("Total Price: $" + total);
    }
}