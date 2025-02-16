package JUnit.AdvancedJUnitProblems.BankTransactions;

public class BankManagement {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(300);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        try {
            account.withdraw(1500);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
