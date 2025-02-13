package MapInterface.bankingSystem;

import java.util.*;

public class BankingSystem {

    // HashMap to store customer accounts (Account Number -> Balance)
    public Map<String, Double> customerAccounts = new HashMap<>();

    // TreeMap to store customers sorted by balance (Balance -> List of Account Numbers)
    private TreeMap<Double, List<String>> sortedAccountsByBalance = new TreeMap<>();

    // Queue to process withdrawal requests (FIFO order)
    public Queue<String> withdrawalRequests = new LinkedList<>();

    // Method to add a customer account
    public void addCustomerAccount(String accountNumber, double balance) {
        customerAccounts.put(accountNumber, balance);
        updateSortedAccountsByBalance();
    }

    // Method to remove a customer account
    public void removeCustomerAccount(String accountNumber) {
        customerAccounts.remove(accountNumber);
        updateSortedAccountsByBalance();
    }

    // Method to update the TreeMap sorted by balance
    private void updateSortedAccountsByBalance() {
        // Clear the existing TreeMap
        sortedAccountsByBalance.clear();

        // Update the TreeMap with customers sorted by balance
        for (Map.Entry<String, Double> entry : customerAccounts.entrySet()) {
            String accountNumber = entry.getKey();
            double balance = entry.getValue();

            sortedAccountsByBalance.putIfAbsent(balance, new ArrayList<>());
            List<String> accounts = sortedAccountsByBalance.get(balance);
            accounts.add(accountNumber);
        }
    }

    // Method to display all customer accounts
    public void displayCustomerAccounts() {
        System.out.println("Customer Accounts (Account Number -> Balance):");
        customerAccounts.forEach((accountNumber, balance) -> {
            System.out.println(accountNumber + " -> Balance: $" + balance);
        });
    }

    // Method to display customers sorted by balance
    public void displaySortedAccountsByBalance() {
        System.out.println("Customers Sorted by Balance (Balance -> Account Numbers):");
        for (Map.Entry<Double, List<String>> entry : sortedAccountsByBalance.entrySet()) {
            double balance = entry.getKey();
            for (String accountNumber : entry.getValue()) {
                System.out.println(accountNumber + " -> Balance: $" + balance);
            }
        }
    }

    // Method to request a withdrawal
    public void requestWithdrawal(String accountNumber, double amount) {
        if (customerAccounts.containsKey(accountNumber) && customerAccounts.get(accountNumber) >= amount) {
            withdrawalRequests.offer(accountNumber);
            System.out.println("Withdrawal request of $" + amount + " added for Account: " + accountNumber);
        } else {
            System.out.println("Insufficient balance or account not found for withdrawal request.");
        }
    }

    // Method to process withdrawal requests
    public void processWithdrawalRequests() {
        System.out.println("Processing Withdrawal Requests:");

        while (!withdrawalRequests.isEmpty()) {
            String accountNumber = withdrawalRequests.poll();
            double amount = 0; // Assume withdrawal amount is fixed for simplicity
            double balance = customerAccounts.get(accountNumber);

            if (balance >= amount) {
                // Process withdrawal
                customerAccounts.put(accountNumber, balance - amount);
                System.out.println("Processed withdrawal of $" + amount + " from Account: " + accountNumber);
            } else {
                System.out.println("Insufficient balance for Account: " + accountNumber);
            }
        }
    }

    // Method to calculate total balance of all accounts
    public double calculateTotalBalance() {
        double totalBalance = 0;
        for (double balance : customerAccounts.values()) {
            totalBalance += balance;
        }
        return totalBalance;
    }

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        // Add customer accounts
        bankingSystem.addCustomerAccount("A101", 5000.0);
        bankingSystem.addCustomerAccount("A102", 3000.0);
        bankingSystem.addCustomerAccount("A103", 1500.0);
        bankingSystem.addCustomerAccount("A104", 7000.0);

        // Display customer accounts
        bankingSystem.displayCustomerAccounts();

        // Display customers sorted by balance
        bankingSystem.displaySortedAccountsByBalance();

        // Request withdrawals
        bankingSystem.requestWithdrawal("A101", 2000.0);
        bankingSystem.requestWithdrawal("A102", 1500.0);
        bankingSystem.requestWithdrawal("A105", 500.0);  // Account not found

        // Process withdrawal requests
        bankingSystem.processWithdrawalRequests();

        // Display updated customer accounts
        bankingSystem.displayCustomerAccounts();

        // Calculate and display total balance of all accounts
        double totalBalance = bankingSystem.calculateTotalBalance();
        System.out.println("Total Balance of All Accounts: $" + totalBalance);
    }
}
