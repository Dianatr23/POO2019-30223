package conturi;
public class CurrentAccount extends Account {
	public double overdraftLimit;
	
	public CurrentAccount(int number, double overdraftLimit) {
		super(number);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount " + this.getAccountNumber() + ":" + "balance = " + this.getBalance() + "-" + " overdraftLimit = " + this.overdraftLimit;
	
	}	
}
