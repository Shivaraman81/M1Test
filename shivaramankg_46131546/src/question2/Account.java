package question2;
import java.time.LocalDate;

class Account {
    int accountNumber;
    String accountHolderName;
    LocalDate openedDate;
    double balance;

    public Account(int accountNumber, String accountHolderName, LocalDate openedDate, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.openedDate = openedDate;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public LocalDate getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(LocalDate openedDate) {
        this.openedDate = openedDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double updatebalance(double amt) {
        balance += amt;
        return balance;
    }

    public double withdraw(double amt) {
        balance -= amt;
        return balance;
    }

    public boolean check(double amount) {
        // false if less that 5000
        return !(balance - amount < 5000);
    }
    // provide all constructors , setters , getters and validation methods
    // always balance must not be less than 5000 Rs.
}
