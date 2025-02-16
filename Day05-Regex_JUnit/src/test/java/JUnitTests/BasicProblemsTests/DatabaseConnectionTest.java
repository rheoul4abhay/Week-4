package JUnitTests.BasicProblemsTests;

import JUnit.BasicJUnitProblems.DatabaseConnection.DatabaseConnection;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {

    @BeforeEach
    public void setUp() {
        DatabaseConnection.connect();
    }

    @Test
    public void testConnectionEstablished() {
        // Act
        boolean result = DatabaseConnection.isConnected();

        // Assert
        assertTrue(result);
    }

    @Test
    public void testConnectionClosed() {
        // Act
        DatabaseConnection.disconnect();
        boolean result = DatabaseConnection.isConnected();

        // Assert
        assertFalse(result);
    }

    @AfterEach
    public void tearDown() {
        DatabaseConnection.disconnect();
    }
}

