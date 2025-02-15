package BankTransactionSystem;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit successful, new balance : $" + getBalance());
        } else throw new IllegalArgumentException("Invalid amount");
    }

    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException{
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance!");
        } else if(amount < 0){
            throw new IllegalArgumentException("Invalid amount");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful, new balance : $" + getBalance());
        }
    }

    public double getBalance(){
        return balance;
    }
}
