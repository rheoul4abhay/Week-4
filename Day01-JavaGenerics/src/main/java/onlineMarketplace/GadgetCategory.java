package onlineMarketplace;

public class GadgetCategory extends Category {
    private static double tax = 5.0;
    public GadgetCategory(String name, double price){
        super(name, price);
    }

    @Override
    public void displayTotalBill(){
        System.out.println(getName() + "'s Total Bill : " + (getPrice() + tax));
    }
}
