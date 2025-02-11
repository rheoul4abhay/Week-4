import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import onlineMarketplace.*;
import java.util.List;

public class OnlineMarketplaceTest {

    @Test
    void productCategoryTest(){
        String name1 = "fiction"; //book category
        String name2 = "automatic"; //gadget category
        String name3 = "formal"; //clothing category

        double price1 = 10.0; // book price
        double price2 = 20.0; // gadget price
        double price3 = 30.0; //cloth price

        Product<Category> products = new Product<>();
        products.addProduct(new BookCategory(name1, price1));
        products.addProduct(new GadgetCategory(name2, price2));
        products.addProduct(new ClothingCategory(name3, price3));

        //products list size check
        assertEquals(3, products.getProducts().size());

        //products name check
        assertEquals("fiction", products.getProducts().get(0).getName(), "Names should be equal");
        assertEquals("automatic", products.getProducts().get(1).getName(), "Names should be equal");
        assertEquals("formal", products.getProducts().get(2).getName(), "Names should be equal");

        //products price check
        assertEquals(10.0, products.getProducts().get(0).getPrice(), "Prices should match");
        assertEquals(20.0, products.getProducts().get(1).getPrice(), "Prices should match");
        assertEquals(30.0, products.getProducts().get(2).getPrice(), "Prices should match");
    }
}
