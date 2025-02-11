package courseManagement;
import java.util.ArrayList;
import java.util.List;

public class UniversityCourseManagement {
    public static void main(String[] args) {
        ExamCourse math101 = new ExamCourse("Mathematics 101");
        AssignmentCourse db201 = new AssignmentCourse("Database Design 201");
        ResearchCourse ml301 = new ResearchCourse("Machine Learning 301");

        //Manage different types of courses using a generic class
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(math101);

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(db201);

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(ml301);

        //Display courses
        System.out.println("Exam courses:");
        examCourses.displayCourses();

        System.out.println("Assignment courses:");
        assignmentCourses.displayCourses();

        System.out.println("Research courses: ");
        researchCourses.displayCourses();

        //Displaying all the courses dynamically using wildcard
        DepartmentUtility engineeringDepartment = new DepartmentUtility("Computer Science Engineering");
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(math101);
        allCourses.add(db201);
        allCourses.add(ml301);

        engineeringDepartment.displayAllCourses(allCourses);
    }
}
