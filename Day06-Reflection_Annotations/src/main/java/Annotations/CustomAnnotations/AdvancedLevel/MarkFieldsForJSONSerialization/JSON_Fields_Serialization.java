package Annotations.CustomAnnotations.AdvancedLevel.MarkFieldsForJSONSerialization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}

class User {
    @JsonField(name = "user_name")
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String toJson() throws Exception {
        StringBuilder json = new StringBuilder("{");
        for (Field field : this.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField jsonField = field.getAnnotation(JsonField.class);
                json.append("\"").append(jsonField.name()).append("\": \"").append(field.get(this)).append("\", ");
            }
        }
        json.delete(json.length() - 2, json.length()).append("}");
        return json.toString();
    }
}

public class JSON_Fields_Serialization {
    public static void main(String[] args) throws Exception {
        User user = new User("Alice");
        System.out.println(user.toJson());
    }
}
