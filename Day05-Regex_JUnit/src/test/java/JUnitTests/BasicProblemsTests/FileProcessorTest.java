package JUnitTests.BasicProblemsTests;

import JUnit.BasicJUnitProblems.FileProcessor.FileProcessor;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessorTest {

    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    public void setUp() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE));
    }

    @Test
    public void testWriteAndReadFromFile() {
        // Arrange
        String content = "JUnit File Test";

        // Act
        FileProcessor.writeToFile(TEST_FILE, content);
        String result = FileProcessor.readFromFile(TEST_FILE);

        // Assert
        assertEquals(content + "\n", result);
    }

    @Test
    public void testFileExistsAfterWrite() {
        // Arrange
        String content = "File existence check.";

        // Act
        FileProcessor.writeToFile(TEST_FILE, content);

        // Assert
        assertTrue(Files.exists(Path.of(TEST_FILE)));
    }

    @Test
    public void testReadFromNonexistentFile() {
        // Act & Assert
        assertEquals("File not found", FileProcessor.readFromFile("nonexistent.txt"));
    }

    @AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE));
    }
}
