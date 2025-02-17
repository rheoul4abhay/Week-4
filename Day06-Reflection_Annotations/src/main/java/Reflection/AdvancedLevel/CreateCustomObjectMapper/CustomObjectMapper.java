package Reflection.AdvancedLevel.CreateCustomObjectMapper;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class CustomObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception{
         T object = clazz.getDeclaredConstructor().newInstance();

         for(Map.Entry<String, Object> entry: properties.entrySet()){
             String fieldName = entry.getKey();
             Object value = entry.getValue();

             //To set field using reflection
             try{
                 Field field = clazz.getDeclaredField(fieldName);
                 field.setAccessible(true);

                 field.set(object, value);
             } catch (RuntimeException e) {
                 System.out.println("Error: " + e.getMessage());
             } catch (Exception e){
                 System.out.println("General error: " + e.getMessage());
             }
         }
         return object; //object with updated field values
    }

    public static void main(String[] args) {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Jack");
        properties.put("age", 25);
        try{
            Person person = toObject(Person.class, properties);
            System.out.println("Created Person: " + person);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

}
