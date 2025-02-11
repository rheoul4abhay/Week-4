package courseManagement;

import java.util.List;

public class DepartmentUtility {
    private String departmentName;

    public DepartmentUtility(String name){
        this.departmentName = name;
    }

    public void removeCourse(List<? extends CourseType> courses, String name){
        for(CourseType course : courses){
            if(course.getName().equalsIgnoreCase(name)){
                courses.remove(course);
            }
        }
    }

    public void displayAllCourses(List<? extends CourseType> courses){
        System.out.println("Courses offered by the " + departmentName + " department: ");
        for(CourseType course : courses){
            System.out.println(" - " + course.getName());
        }
    }
}
