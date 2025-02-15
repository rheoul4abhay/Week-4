package BankTransactionSystem;

public class BankTransactionSystem {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(100.0);
        try{
            myAccount.deposit(20.0);
            myAccount.withdraw(150.0);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
            }
    }
}
