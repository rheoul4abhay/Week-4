package Reflection.AdvancedLevel.GenerateJSONRepresentation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JSON_RepresentationGenerator {

    public static String toJson(Object object) throws IllegalArgumentException, IllegalAccessException {

        if(object == null) return null;
        Class<?> clazz = object.getClass();

        Map<String, Object> fieldMap = new HashMap<>();

        Field[] fields = clazz.getDeclaredFields();

        for(Field field : fields){
            field.setAccessible(true);
            String fieldName = field.getName(); //get field name
            Object fieldValue = field.get(object); //get field value
            fieldMap.put(fieldName, fieldValue);
        }
        return mapToJson(fieldMap);
    }

    public static String mapToJson(Map<String, Object> map) throws IllegalAccessException {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");

        int size = map.size();
        int index = 0;

        for(Map.Entry<String, Object> entry: map.entrySet()){
            jsonBuilder.append("\"")
                    .append(entry.getKey())
                    .append("\": ");

            Object value = entry.getValue();
            if(value instanceof String){
                jsonBuilder.append("\"")
                        .append(value)
                        .append("\"");
            } else if (value instanceof Number || value instanceof Boolean) {
                jsonBuilder.append(value);
            } else {
                jsonBuilder.append(toJson(value));
            }

            // Add a comma if it's not the last entry
            if (index < size - 1) {
                jsonBuilder.append(", ");
            }
            index++;
        }
        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }

    public static void main(String[] args) {
        Person person = new Person("Abhay", 22, true);
        Address address = new Address("Bhopal", "India");

        person.setAddress(address);

        try{
            String json = toJson(person);
            System.out.println("JSON Representation: " + json);
        } catch (IllegalArgumentException | IllegalAccessException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
