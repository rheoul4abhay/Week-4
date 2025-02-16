package JUnitTests.AdvancedProblemsTests;

import JUnit.AdvancedJUnitProblems.BankTransactions.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        // Arrange
        BankAccount account = new BankAccount(1000.0);

        // Act
        account.deposit(500);

        // Assert
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        // Arrange
        BankAccount account = new BankAccount(1000.0);

        // Act
        account.withdraw(400);

        // Assert
        assertEquals(600.0, account.getBalance());
    }

    @Test
    public void testInsufficientFunds() {
        // Arrange
        BankAccount account = new BankAccount(500.0);

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(600));
    }

    @Test
    public void testDepositNegativeAmount() {
        // Arrange
        BankAccount account = new BankAccount(1000.0);

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
    }
}
