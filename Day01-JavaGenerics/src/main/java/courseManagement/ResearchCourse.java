package courseManagement;

public class ResearchCourse extends CourseType{
    public ResearchCourse(String name){
        super(name);
    }

    public void evaluate(){
        System.out.println(getName() + " is evaluated by research work.");
    }
}
