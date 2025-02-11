package courseManagement;

public class ExamCourse extends CourseType{
    public ExamCourse(String name){
        super(name);
    }

    @Override
    public void evaluate(){
        System.out.println(getName() + " is evaluated by exams.");
    }
}
