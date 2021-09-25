package question2;
import java.time.LocalDate;
class Transaction {
    public static double deposit(Account account, double amount) 
    {
        
        return account.updatebalance(amount);
    }

    public static double withdraw(Account account, double amount) throws InsufficientBalanceException {
        
        if (account.check(amount)) {
            return account.withdraw(amount);
        } else {
            throw new InsufficientBalanceException("Invalid Balance");
        }
    }

    public static void main(String[] args) throws InsufficientBalanceException {
        Account account = new Account(9021, "Harish", LocalDate.now(),9090);
        System.out.println("Deposit amount is:"+deposit(account, 2000));
        System.out.println("Withdraw Amount is:"+withdraw(account, 800));
    }
}

class InsufficientBalanceException extends Exception {
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String message) {
        super(message);
    }

}