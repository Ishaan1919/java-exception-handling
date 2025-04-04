import java.util.Scanner;

public class CheckedAndCustomException{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount ba = new BankAccount(1000);
        try{
            ba.withdraw(10000);
            ba.withdraw(-1);
        } catch (InsufficientBalanceException  e){
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

class BankAccount{
    int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }

    void deposit(int money){
        this.balance += money;
    }

    void withdraw(int money) throws InsufficientBalanceException, IllegalArgumentException {
        if(money > balance){
            throw new InsufficientBalanceException("Insuficient balance");
        }
        if(money < 0){
            throw new IllegalArgumentException("Money can not be negative");
        }
        this.balance -= money;
    }
}








//import java.util.Scanner;
//
//class InsufficientBalanceException extends Exception {
//    public InsufficientBalanceException(String message) {
//        super(message);
//    }
//}
//
//class BankAccount {
//    private double balance;
//
//    public BankAccount(double balance) {
//        this.balance = balance;
//    }
//
//    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
//        if (amount < 0) {
//            throw new IllegalArgumentException("Invalid amount!");
//        }
//        if (amount > balance) {
//            throw new InsufficientBalanceException("Insufficient balance!");
//        }
//        balance -= amount;
//        System.out.println("Withdrawal successful, new balance: " + balance);
//    }
//}
//
//public class CheckedAndCustomException {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter initial balance: ");
//        double initialBalance = scanner.nextDouble();
//        BankAccount account = new BankAccount(initialBalance);
//
//        try {
//            System.out.print("Enter withdrawal amount: ");
//            double amount = scanner.nextDouble();
//            account.withdraw(amount);
//        } catch (InsufficientBalanceException e) {
//            System.out.println(e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println("An unexpected error occurred.");
//        } finally {
//            scanner.close();
//        }
//    }
//}
