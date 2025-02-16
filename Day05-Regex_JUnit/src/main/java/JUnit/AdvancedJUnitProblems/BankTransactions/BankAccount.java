package JUnit.AdvancedJUnitProblems.BankTransactions;

public class BankAccount {
    public double balance;

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        } else{
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount){
        if(amount > balance){
            throw new IllegalArgumentException("Insufficient Funds");
        } else{
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}
