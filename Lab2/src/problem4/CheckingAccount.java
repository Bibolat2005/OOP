package problem4;
import java.util.Objects;
public class CheckingAccount extends Account{
	int transactions=0;
	int FREE_TRANSACTIONS=2;
	public CheckingAccount(int accNumber) {
		super(accNumber);
	}
	public void deposit(double sum) {
		super.deposit(sum);
		transactions+=1;
	}
	public void deductFee() {
		if(transactions>FREE_TRANSACTIONS) {
			super.withdraw(0.02);
		}
	}
	
	// equals , hashCode , toString
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		CheckingAccount ch = (CheckingAccount)o;
		return this.transactions == ch.transactions;
}
	public int hashCode() {
	    return Objects.hash(super.hashCode(), transactions);
	}
	
	public String toString() {
		
	return "CheckingAccount " + "accountNumber=" + super.getAccauntNumber() + ", transactions=" + transactions;
	}
}
