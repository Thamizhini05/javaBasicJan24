package jan24_assignment;
public class BankDriven {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savingsAccount = new SavingsAccount(5000.0, 1000.0);
        CurrentAccount currentAccount = new CurrentAccount(6000.0);
		bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);
        System.out.println("Amount in Savings Account before depositing Amount:" +savingsAccount.getBalance());
        System.out.println("Amount in current Account before depositing Amount:"+currentAccount.getBalance());
		System.out.println("Now deposit 100 Savings Account.");
		savingsAccount.deposit(100.0);
		System.out.println(savingsAccount.getBalance());
        System.out.println("Now deposit 100  Current Account");
        currentAccount.deposit(100.0);
        System.out.println(currentAccount.getBalance());
		System.out.println("Withdraw 100 from Savings Account");
		savingsAccount.withdraw(100.0);
		System.out.println(savingsAccount.getBalance());
		System.out.println("Withdraw 100 from Current Account");
		currentAccount.withdraw(100.0);
		System.out.println(currentAccount.getBalance());
        System.out.println("After applying interest");
        System.out.println(savingsAccount.calculateInterest());
        System.out.println("After applying interest");
        System.out.println(currentAccount.calculateInterest());
	
    }
}
