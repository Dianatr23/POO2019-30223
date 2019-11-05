package conturi;

public class BankTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.open(342, 0.12F);
		bank.a[0].deposit(100);
		bank.a[0].withdraw(150);
		
		bank.open(23, 0.10F);
		bank.a[1].deposit(500);
		bank.a[1].withdraw(146);
		
		bank.close(23);
		
		bank.open(12, 0.07F);
		bank.a[2].deposit(2312);
		
		bank.update();
		
		for(int i=0; i<bank.a.length;i++) {
			if(bank.a[i] != null) {
				bank.a[i].print();
			}
		}
	}

}
