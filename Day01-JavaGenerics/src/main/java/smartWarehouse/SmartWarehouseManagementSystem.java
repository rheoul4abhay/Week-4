package smartWarehouse;

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        groceriesStorage.addItem(new Groceries("Apples"));
        groceriesStorage.addItem(new Groceries("Milk"));

        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("Chair"));

        System.out.println("Electronics Storage:");
        StorageUtility.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Storage:");
        StorageUtility.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Storage:");
        StorageUtility.displayItems(furnitureStorage.getItems());
    }
}
