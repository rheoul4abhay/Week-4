package MapInterfaceTests;

import MapInterface.shoppingCart.ShoppingCartManagementSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartManagementSystemTest {

    private ShoppingCartManagementSystem shoppingCart;

    @BeforeEach
    void setUp() {
        shoppingCart = new ShoppingCartManagementSystem();
        shoppingCart.addItemToCart("Laptop", 1);
        shoppingCart.addItemToCart("Smartphone", 2);
        shoppingCart.addItemToCart("Headphones", 1);
        shoppingCart.addItemToCart("Keyboard", 3);
    }

    @Test
    void testAddItemToCart_ValidProduct() {
        // Act
        shoppingCart.addItemToCart("Mouse", 2);

        // Assert
        assertEquals(2, shoppingCart.cartItems.get("Mouse"), "Mouse quantity should be 2.");
    }

    @Test
    void testAddItemToCart_InvalidProduct() {
        // Act
        shoppingCart.addItemToCart("InvalidProduct", 1);

        // Assert
        // Ensure that no invalid product was added to the cart
        assertNull(shoppingCart.cartItems.get("InvalidProduct"), "Invalid product should not be added to the cart.");
    }

    @Test
    void testRemoveItemFromCart_ExistingItem() {
        // Act
        shoppingCart.removeItemFromCart("Smartphone");

        // Assert
        assertNull(shoppingCart.cartItems.get("Smartphone"), "Smartphone should be removed from the cart.");
    }

    @Test
    void testRemoveItemFromCart_NonExistingItem() {
        // Act
        shoppingCart.removeItemFromCart("NonExistingItem");

        // Assert
        // Ensure that no item is removed from the cart
        assertNull(shoppingCart.cartItems.get("NonExistingItem"), "Non-existing item should not be removed.");
    }

    @Test
    void testDisplayCartItems() {
        // Act
        shoppingCart.displayCartItems();

        // Assert
        // Check the console output manually or mock System.out to verify the output
    }

    @Test
    void testDisplayItemsSortedByPrice() {
        // Act
        shoppingCart.displayItemsSortedByPrice();

        // Assert
        // Check the console output manually or mock System.out to verify the output
    }

    @Test
    void testCalculateTotalPrice() {
        // Act
        double total = shoppingCart.calculateTotalPrice();

        // Assert
        double expectedTotal = 1 * 1000.0 + 2 * 700.0 + 1 * 150.0 + 3 * 50.0;
        assertEquals(expectedTotal, total, "Total price calculation should be correct.");
    }
}
