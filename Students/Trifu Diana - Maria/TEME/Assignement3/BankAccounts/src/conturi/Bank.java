package conturi;

public class Bank{
	Account[] a = new Account[100];
	public int n;
	
	public Bank() {
		this.n = 0;
	}
	
	public void update() {
		for(int i=0;i<this.a.length;i++) {
			if(this.a[i]!=null && this.a[i].getClass().getName()=="SavingsAccount") {
				((SavingsAccount)this.a[i]).addInterest();
			}
			if(this.a[i]!=null && this.a[i].getClass().getName()=="CurrentAccount") {
				if(this.a[i].getBalance()<0 && this.a[i].getBalance()>-((CurrentAccount)this.a[i]).overdraftLimit)
						System.out.println("You are in overdraft");
			}
		}
	}
	
	//we add an account in the array
	public void open(int number, double balance) {
		this.a[this.n] = new Account(number);
		this.n++;
	}
	
	//we close an account from the array
	public void close(int number) {
		for(int i=0; i<this.a.length; i++) {
			if(this.a[i] != null && this.a[i].getAccountNumber()==number) {
				this.a[i] = null;
			}
		}
	}
	
	//bank pays dividends into an account
	public void payDividend(int d, int number) {
		for(int i=0; i<this.a.length;i++) {
			if(this.a[i] != null && this.a[i].getAccountNumber() == number) {
				if(d>0)
					a[i].deposit(d);
			}
		}
	}
}
