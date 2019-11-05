package conturi;
public class SavingsAccount extends Account {
	public double interestRate;
	
	public SavingsAccount(int number, double interestRate) {
		super(number);
		this.interestRate = interestRate;
	}

	public void addInterest() {
		this.deposit(this.interestRate * this.getBalance());
	}
	
	@Override
	public String toString() {
		return "SavingsAccount " + this.getAccountNumber() + ":" + "balance = " + this.getBalance() + "-" + "interestRate = " + this.interestRate;
	}

}
