import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import onlineMarketplace.*;
import java.util.List;

public class OnlineMarketplaceTest {

    @Test
    void productCategoryTest_Pass(){
        String bookCategoryName = "fiction"; //book category
        String gadgetCategoryName = "automatic"; //gadget category
        String clothingCategoryName = "formal"; //clothing category

        double bookPrice = 10.0; // book price
        double gadgetPrice = 20.0; // gadget price
        double clothingPrice = 30.0; //cloth price

        Product<Category> products = new Product<>();
        products.addProduct(new BookCategory(bookCategoryName, bookPrice));
        products.addProduct(new GadgetCategory(gadgetCategoryName, gadgetPrice));
        products.addProduct(new ClothingCategory(clothingCategoryName, clothingPrice));

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

    @Test
    void ProductCategoryTest_Fail(){
        class DummyCategory{
            String name;
            double price;
            public DummyCategory(String name, double price){
                this.name = name;
                this.price = price;
            }
        }
        String bookCategoryName = "fiction"; //book category
        double bookPrice = 10.0; // book price
        Product<Category> products = new Product<>();

        products.addProduct(new BookCategory(bookCategoryName, bookPrice));
        //products.addProduct(new DummyCategory("dummy_name", 0.0)); this will throw compile time error as dummy category does not extends
        // Category class
    }
}
