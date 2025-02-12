package SetInterfaceTests;

import SetInterface.InsurancePolicyManagementSystem.InsurancePolicy;
import SetInterface.InsurancePolicyManagementSystem.InsurancePolicyManagementSystem;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class InsurancePolicyManagementTest {

    @Test
    void addPolicyTest() {
        // Arrange
        InsurancePolicyManagementSystem policyManager = new InsurancePolicyManagementSystem();
        InsurancePolicy policy = new InsurancePolicy("P789", "John Doe", LocalDate.of(2025, 6, 15), "Health", 8000.0);

        // Act
        policyManager.addPolicy(policy);

        // Assert
        assertTrue(policyManager.hashSet.contains(policy), "Policy should be added to the hash set");
    }

    @Test
    void displayExpiringPoliciesTest() {
        // Arrange
        InsurancePolicyManagementSystem policyManager = new InsurancePolicyManagementSystem();
        InsurancePolicy policy = new InsurancePolicy("P123", "Jane Smith", LocalDate.now().plusDays(15), "Vehicle", 5000.0);
        policyManager.addPolicy(policy);

        // Act & Assert
        assertDoesNotThrow(policyManager::displayExpiringPolicies, "Should display expiring policies without errors");
    }

    @Test
    void displayByCoverageTypeTest() {
        // Arrange
        InsurancePolicyManagementSystem policyManager = new InsurancePolicyManagementSystem();
        InsurancePolicy policy = new InsurancePolicy("P456", "Alice Brown", LocalDate.of(2025, 9, 1), "Home", 12000.0);
        policyManager.addPolicy(policy);

        // Act & Assert
        assertDoesNotThrow(() -> policyManager.displayByCoverageType("Home"), "Should display policies by coverage type without errors");
    }

    @Test
    void findDuplicatePoliciesTest() {
        // Arrange
        InsurancePolicyManagementSystem policyManager = new InsurancePolicyManagementSystem();
        InsurancePolicy policy1 = new InsurancePolicy("P123", "David Green", LocalDate.of(2025, 3, 1), "Health", 7000.0);
        InsurancePolicy policy2 = new InsurancePolicy("P123", "Duplicate", LocalDate.of(2025, 4, 1), "Health", 7000.0);
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);

        // Act & Assert
        assertDoesNotThrow(policyManager::findDuplicatePolicies, "Should find duplicate policies without errors");
    }

    @Test
    void comparePerformanceTest() {
        // Arrange
        InsurancePolicyManagementSystem policyManager = new InsurancePolicyManagementSystem();

        // Act & Assert
        assertDoesNotThrow(policyManager::comparePerformance, "Performance comparison should execute without errors");
    }
}
