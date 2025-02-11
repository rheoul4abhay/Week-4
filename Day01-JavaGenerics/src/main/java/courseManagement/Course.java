package courseManagement;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    List<T> courseList;
    public Course(){
        this.courseList = new ArrayList<>();
    }

    public void addCourse(T course){
        courseList.add(course);
    }

    public List<T> getCourseList(){
        return courseList;
    }

    public void displayCourses(){
        for(T course : courseList){
            System.out.println("Course: " + course.getName());
            course.evaluate();
        }
    }
}
