import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import smartWarehouse.*;
import java.util.List;

public class SmartWarehouseTest {

    @Test
    void furnitureTest(){
        String name1 = "Table";
        String name2 = "Chair";

        Furniture table = new Furniture(name1);
        Furniture chair = new Furniture(name2);

        Storage<Furniture> furnitures = new Storage<>();
        furnitures.addItem(table);
        furnitures.addItem(chair);

        assertEquals(2, furnitures.getItems().size());
        assertEquals(name1, furnitures.getItems().get(0).getName());
        assertEquals(name2, furnitures.getItems().get(1).getName());
    }

    @Test
    void electronicsTest(){
        String name1 = "Camera";
        String name2 = "Laptop";

        Electronics camera = new Electronics(name1);
        Electronics laptop = new Electronics(name2);

        Storage<Electronics> electronics = new Storage<>();
        electronics.addItem(camera);
        electronics.addItem(laptop);

        assertEquals(2, electronics.getItems().size());
        assertEquals(name1, electronics.getItems().get(0).getName());
        assertEquals(name2, electronics.getItems().get(1).getName());
    }

    @Test
    void groceriesTest(){
        String name1 = "Sugar";
        String name2 = "Cashew";

        Groceries camera = new Groceries(name1);
        Groceries laptop = new Groceries(name2);

        Storage<Groceries> groceries = new Storage<>();
        groceries.addItem(camera);
        groceries.addItem(laptop);

        assertEquals(2, groceries.getItems().size());
        assertEquals(name1, groceries.getItems().get(0).getName());
        assertEquals(name2, groceries.getItems().get(1).getName());
    }
}
