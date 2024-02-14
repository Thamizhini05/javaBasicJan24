package jan24_assignment;
public class SavingsAccount implements Account {
    private double balance;
    private double interestRate;
    private double interest;
    public SavingsAccount(double initialDeposit, double interestRate) {// Constructor
        this.balance = initialDeposit;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
   

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		balance += balance * interestRate / 100;
		return balance;
	}


}
