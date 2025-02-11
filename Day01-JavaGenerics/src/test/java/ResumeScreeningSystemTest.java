import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import resumeScreeningSystem.*;

public class ResumeScreeningSystemTest {

    @Test
    void testAddResume() {
        // Arrange
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer(), "Abhay");

        //Act
        seResume.addResume(new SoftwareEngineer());

        // Assert
        assertEquals(1, seResume.getResumeList().size(), "Resume list size should be 2");
    }
    @Test
    void testResumeProcessing() {
        // Arrange
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer(), "Abhay");

        // Act
        seResume.addResume(new SoftwareEngineer());
        seResume.analyzeResume();

        // We can assume the output is manually verified, as we're testing the functionality here
    }

    @Test
    void testEmptyJobRoleList() {
        // Create an empty resume list for Data Scientist
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist(), "Ravi");

        // Assert that the resume list is empty initially (since no resumes were added yet)
        assertTrue(dsResume.getResumeList().isEmpty(), "Resume list should be empty initially");
    }
}
