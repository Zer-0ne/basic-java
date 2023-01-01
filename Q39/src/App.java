import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    App account = new App(1000);
    account.deposit(500);
    account.withdraw(50);

    System.out.println("BankAccount " + account.getNumber());
    System.out.println("Has a balance of " + account.getBalance());
  }

  // These are different for each account
  private double balance;
  private int accountNumber;

  // This is shared by all accounts, so it's static
  private static int lastAccountNumber = 0;

  // This is a constructor: no return type (void, boolean etc) and has the same name as the class.
  public App(double intialBalance) {
    balance = intialBalance;

    accountNumber = lastAccountNumber + 1;
    lastAccountNumber = accountNumber;
  }

  public void deposit(double depositAmount) {
    balance += depositAmount;
  }

  public boolean withdraw(double withdrawAmount) {
    if (withdrawAmount > balance) {
      System.out.println("Insufficient Funds!!!");
      return false;
    } else {
      balance -= withdrawAmount;
      return true;
    }
  }

  public int getNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }
}
