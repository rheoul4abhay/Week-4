package onlineMarketplace;

import java.util.List;

public abstract class Category {
    private String name;
    private double price;
    public Category(String name, double price){
        this.name = name;
        this.price = price;
    }

    //getters and setters
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setPrice(double newPrice){
        price = newPrice;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ": " + name + " | " + "Price : $" + price;
    }

    abstract void displayTotalBill();

    public static void displayItems(List<? extends Category> items){
        for(Category item: items){
            System.out.println(item.toString());
        }
    }
}
