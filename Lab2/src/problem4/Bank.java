package problem4;
import java.util.Vector;
public class Bank {
	Vector<Account> v1 = new Vector<Account>();
	
	public Bank(){
		
	}
//	Vector<Account> v1 = new Vector<Account>();
	public void add(Account a) {
		v1.add(a);
	}
	
	public void update() {
		for(Account a : v1) {
			if(a.getClass() == SavingsAccount.class) {
				//a.deposit(20);
				((SavingsAccount)a).deposit(20);
			}
			else if(a.getClass()== CheckingAccount.class) {
				((CheckingAccount)a).deductFee();
			
			}
			if(a.getClass()==Account.class) {
				
			}
		}
	}
	public void printAllAcc() {
		for(Account a : v1) {
			System.out.println(a);
		}
	}
	
}
