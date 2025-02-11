package courseManagement;

public class AssignmentCourse extends CourseType{
    public AssignmentCourse(String name){
        super(name);
    }

    public void evaluate(){
        System.out.println(getName() + " is evaluated by assignment submissions.");
    }
}
