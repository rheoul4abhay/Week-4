package MapInterface.shoppingCart;

import java.util.*;

public class ShoppingCartManagementSystem {

    // HashMap to store product prices
    private Map<String, Double> productPrices = new HashMap<>();

    // LinkedHashMap to maintain the order of items added to the cart
    public Map<String, Integer> cartItems = new LinkedHashMap<>();

    // TreeMap to store the products sorted by price
    private TreeMap<Double, List<String>> sortedItemsByPrice = new TreeMap<>();

    // Constructor to add some sample products and their prices
    public void ShoppingCart() {
        // Adding products and their prices to the productPrices map
        productPrices.put("Laptop", 1000.0);
        productPrices.put("Smartphone", 700.0);
        productPrices.put("Headphones", 150.0);
        productPrices.put("Keyboard", 50.0);
        productPrices.put("Mouse", 25.0);
    }

    // Method to add items to the cart
    public void addItemToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
            updateSortedItemsByPrice();
        } else {
            System.out.println("Product not available: " + product);
        }
    }

    // Method to remove an item from the cart
    public void removeItemFromCart(String product) {
        if (cartItems.containsKey(product)) {
            cartItems.remove(product);
            updateSortedItemsByPrice();
        } else {
            System.out.println("Item not found in the cart: " + product);
        }
    }

    // Method to update the TreeMap after adding or removing items from the cart
    private void updateSortedItemsByPrice() {
        // Clear the existing TreeMap
        sortedItemsByPrice.clear();

        // Update the TreeMap with the current cart items, sorted by price
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = productPrices.get(product);

            // Add product and its quantity to the TreeMap, grouped by price
            sortedItemsByPrice.putIfAbsent(price, new ArrayList<>());
            List<String> products = sortedItemsByPrice.get(price);
            for (int i = 0; i < quantity; i++) {
                products.add(product);
            }
        }
    }

    // Method to display all items in the cart
    public void displayCartItems() {
        System.out.println("Items in Cart (Order Added):");
        cartItems.forEach((product, quantity) -> {
            System.out.println(product + " -> Quantity: " + quantity + " -> Price: $" + productPrices.get(product));
        });
    }

    // Method to display items sorted by price
    public void displayItemsSortedByPrice() {
        System.out.println("Items Sorted by Price:");
        for (Map.Entry<Double, List<String>> entry : sortedItemsByPrice.entrySet()) {
            double price = entry.getKey();
            for (String product : entry.getValue()) {
                System.out.println(product + " -> Price: $" + price);
            }
        }
    }

    // Method to calculate the total price of the items in the cart
    public double calculateTotalPrice() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            total += productPrices.get(product) * quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        ShoppingCartManagementSystem shoppingCart = new ShoppingCartManagementSystem();

        // Add items to the cart
        shoppingCart.addItemToCart("Laptop", 1);
        shoppingCart.addItemToCart("Smartphone", 2);
        shoppingCart.addItemToCart("Headphones", 1);
        shoppingCart.addItemToCart("Keyboard", 3);

        // Display the cart items
        shoppingCart.displayCartItems();  // Display items in the order they were added

        // Display items sorted by price
        shoppingCart.displayItemsSortedByPrice();

        // Calculate the total price of the items in the cart
        double total = shoppingCart.calculateTotalPrice();
        System.out.println("Total Price: $" + total);

        // Remove an item from the cart
        shoppingCart.removeItemFromCart("Smartphone");

        // Display the updated cart items
        shoppingCart.displayCartItems();
    }
}
