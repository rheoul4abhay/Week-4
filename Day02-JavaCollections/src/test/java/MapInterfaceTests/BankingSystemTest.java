package MapInterfaceTests;

import MapInterface.bankingSystem.BankingSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankingSystemTest {

    private BankingSystem bankingSystem;

    @BeforeEach
    void setUp() {
        bankingSystem = new BankingSystem();
        bankingSystem.addCustomerAccount("A101", 5000.0);
        bankingSystem.addCustomerAccount("A102", 3000.0);
        bankingSystem.addCustomerAccount("A103", 1500.0);
        bankingSystem.addCustomerAccount("A104", 7000.0);
    }

    @Test
    void testAddCustomerAccount() {
        // Arrange
        String accountNumber = "A105";
        double balance = 4000.0;

        // Act
        bankingSystem.addCustomerAccount(accountNumber, balance);

        // Assert
        assertEquals(balance, bankingSystem.customerAccounts.get(accountNumber), "Account balance should be correctly added.");
    }

    @Test
    void testRemoveCustomerAccount() {
        // Arrange
        String accountNumber = "A103";

        // Act
        bankingSystem.removeCustomerAccount(accountNumber);

        // Assert
        assertNull(bankingSystem.customerAccounts.get(accountNumber), "Account should be removed successfully.");
    }

    @Test
    void testRequestWithdrawal_ValidRequest() {
        // Arrange
        String accountNumber = "A101";
        double amount = 2000.0;

        // Act
        bankingSystem.requestWithdrawal(accountNumber, amount);

        // Assert
        assertTrue(bankingSystem.withdrawalRequests.contains(accountNumber), "Withdrawal request should be added for valid account.");
    }

    @Test
    void testRequestWithdrawal_InvalidRequest_AccountNotFound() {
        // Arrange
        String accountNumber = "A105";
        double amount = 500.0;

        // Act
        bankingSystem.requestWithdrawal(accountNumber, amount);

        // Assert
        assertFalse(bankingSystem.withdrawalRequests.contains(accountNumber), "No withdrawal request should be added for non-existent account.");
    }

    @Test
    void testProcessWithdrawalRequests() {
        // Arrange
        String accountNumber = "A101";
        double amount = 2000.0;
        bankingSystem.requestWithdrawal(accountNumber, amount);

        // Act
        bankingSystem.processWithdrawalRequests();

        // Assert
        assertEquals(3000.0, bankingSystem.customerAccounts.get(accountNumber), "Account balance should be updated after withdrawal.");
    }

    @Test
    void testCalculateTotalBalance() {
        // Act
        double totalBalance = bankingSystem.calculateTotalBalance();

        // Assert
        assertEquals(16500.0, totalBalance, "Total balance should be correctly calculated.");
    }

    @Test
    void testDisplaySortedAccountsByBalance() {
        // Act
        bankingSystem.displaySortedAccountsByBalance();

        // Assert
        // Verify output visually or by mocking System.out in tests
    }

    @Test
    void testDisplayCustomerAccounts() {
        // Act
        bankingSystem.displayCustomerAccounts();

        // Assert
        // Verify output visually or by mocking System.out in tests
    }
}
