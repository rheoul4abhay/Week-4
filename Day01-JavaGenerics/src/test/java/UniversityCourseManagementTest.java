import org.junit.jupiter.api.*;

import courseManagement.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UniversityCourseManagementTest {

    @Test
    void testAddCourseToExamCourse(){
        //Arrange
        ExamCourse math101 = new ExamCourse("Mathematics 101");
        Course<ExamCourse> examCourses = new Course<>();

        //Act
        examCourses.addCourse(math101);
        List<ExamCourse> courses = examCourses.getCourseList();

        //Assert
        assertEquals(1, courses.size());
        assertEquals("Mathematics 101", courses.get(0).getName());
    }

    @Test
    void testAddCourseToAssignmentCourse(){
        //Arrange
        AssignmentCourse db201 = new AssignmentCourse("Database Design 201");
        Course<AssignmentCourse> assignmentCourses = new Course<>();

        //Act
        assignmentCourses.addCourse(db201);
        List<AssignmentCourse> courses = assignmentCourses.getCourseList();

        //Assert
        assertEquals(1, courses.size());
        assertEquals("Database Design 201", courses.get(0).getName());
    }

    @Test
    void testAddCourseToResearchCourse(){
        //Arrange
        ResearchCourse db201 = new ResearchCourse("Machine Learning 301");
        Course<ResearchCourse> researchCourses = new Course<>();

        //Act
        researchCourses.addCourse(db201);
        List<ResearchCourse> courses = researchCourses.getCourseList();

        //Assert
        assertEquals(1, courses.size());
        assertEquals("Machine Learning 301", courses.get(0).getName());
    }

    @Test
    void testEvaluateExamCourse(){
        //Arrange
        ExamCourse math101 = new ExamCourse("Mathematics 101");

        //Act & Assert
        assertDoesNotThrow(math101::evaluate); //check if evaluate runs without exceptions
    }

    @Test
    void testEvaluateAssignmentCourse(){
        //Arrange
        AssignmentCourse db201 = new AssignmentCourse("Database Design 201");

        //Act & Assert
        assertDoesNotThrow(db201::evaluate); //check if evaluate runs without exceptions
    }

    @Test
    void testDepartementDisplayAllCourses(){
        //Arrange
        DepartmentUtility engineeringDepartment = new DepartmentUtility("Engineering");
        List<CourseType> allCourses = List.of(
                new ExamCourse("Mathematics 101"),
                new AssignmentCourse("Database Design 201"),
                new ResearchCourse("Machine Learning 301")
        );

        //Act and assert
        assertDoesNotThrow(() -> engineeringDepartment.displayAllCourses(allCourses));
    }

    @Test
    void testCourseListOperations(){
        //Arrange
        Course<CourseType> allCourses = new Course<>();
        ExamCourse math101 = new ExamCourse("Mathematics 101");
        AssignmentCourse db201 = new AssignmentCourse("Database Design 201");

        //Act
        allCourses.addCourse(math101);
        allCourses.addCourse(db201);

        //Assert
        List<CourseType> courses = allCourses.getCourseList();
        assertEquals(2, courses.size());
        assertTrue(courses.contains(math101));
        assertTrue(courses.contains(db201));
    }
}
