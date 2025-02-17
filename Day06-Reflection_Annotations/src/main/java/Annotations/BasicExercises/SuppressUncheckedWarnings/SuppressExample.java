package Annotations.BasicExercises.SuppressUncheckedWarnings;

import java.util.ArrayList;

public class SuppressExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Test");
        list.add(10);
        System.out.println(list);
    }
}
