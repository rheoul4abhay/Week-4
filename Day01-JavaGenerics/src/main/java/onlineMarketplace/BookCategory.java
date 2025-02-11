package onlineMarketplace;

public class BookCategory extends Category{
    private static double tax = 2.0;
    public BookCategory(String name, double price){
        super(name, price);
    }

    @Override
    public void displayTotalBill(){
        System.out.println(getName() + "'s Total Bill : " + (getPrice() + tax));
    }
}
