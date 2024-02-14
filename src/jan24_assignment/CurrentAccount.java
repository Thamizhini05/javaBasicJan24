package jan24_assignment;
public class CurrentAccount implements Account {
    private double balance;
    public CurrentAccount(double initialDeposit) {
        this.balance = initialDeposit;
   
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
        
    }

    @Override
    public void withdraw(double amount) {
    	balance -=amount;
    	
    }

    @Override
    public double getBalance() {
        return balance;
    }
    
    
	@Override
	public double calculateInterest() {
		balance += balance * 0.3 / 100;
		return balance;
	}

}
