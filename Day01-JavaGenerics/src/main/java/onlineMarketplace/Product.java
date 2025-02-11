package onlineMarketplace;
import java.util.ArrayList;
import java.util.List;

public class Product<T extends Category> {
    List<T> products;
    public Product(){
        this.products = new ArrayList<>();
    }

    public void addProduct(T newProduct){
        products.add(newProduct);
    }

    public List<T> getProducts(){
        return products;
    }

    public void applyDiscount(double percentage){
        for(T product: products){
            product.setPrice(product.getPrice()-(percentage * product.getPrice() / 100.0));
        }
    }
}
