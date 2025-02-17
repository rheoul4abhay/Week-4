package Reflection.IntermediateLevel.RetrieveAnnotationsAtRuntime;

import java.lang.annotation.Retention;

public class AnnotationsRuntimeRetrieval {
    public static void main(String[] args) {

        Class<newClass> myClass = newClass.class;
        if(myClass.isAnnotationPresent(Author.class)){
            //Retrieve @Author annotation
            Author authorAnnotation = myClass.getAnnotation(Author.class);

            //get value of @Author annotation
            String authorName = authorAnnotation.name();
            System.out.println("Author of newClass : " + authorName);
        } else{
            System.out.println("No @Author annotation found on newClass.");
        }
    }
}
