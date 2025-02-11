package onlineMarketplace;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        BookCategory fiction = new BookCategory("Fiction", 10.0);
        BookCategory crime = new BookCategory("Crime", 20.0);

        GadgetCategory automatic = new GadgetCategory("Automatic", 50.0);
        GadgetCategory semi_automatic = new GadgetCategory("SemiAutomatic", 60.0);

        ClothingCategory formal = new ClothingCategory("Formal", 100.0);
        ClothingCategory casual = new ClothingCategory("Casual", 200.0);

        Product<Category> productCategories = new Product<>();
        productCategories.addProduct(crime);
        productCategories.addProduct(formal);
        productCategories.addProduct(semi_automatic);
        productCategories.addProduct(automatic);
        productCategories.addProduct(fiction);
        productCategories.addProduct(casual);

        //To display all the products in a list
        System.out.println("\nBefore discount: ");
        Category.displayItems(productCategories.getProducts());
        DiscountUtility.applyDiscount(productCategories, 50.0);
        System.out.println("\nAfter discount: ");
        Category.displayItems(productCategories.getProducts());
    }
}
