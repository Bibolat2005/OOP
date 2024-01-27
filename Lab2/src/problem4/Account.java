package problem4;

public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int a) {
		balance=0.0;
		accNumber=a;
	}
	public void deposit(double sum) {
		balance+=sum;
	}
	public void withdraw(double sum) {
		balance-=sum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public double getAccauntNumber() {
		return accNumber;
	}
	public void transfer(double amount, Account other) {
		if(this.getBalance() -amount>0) {
			this.withdraw(amount);
			other.deposit(amount);
			//balance-=amount;
			//other.balance += amount;
		}
		else {
			System.out.println("Transfer is not allowed");
		}
	
	}
	public String toString() {
		return "Person with account number" + accNumber + " has " + balance;
	}
	public final void print() {
		System.out.println(toString());
	}
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null) return false;
		if(this.getClass() != o.getClass()) return false;
		Account c = (Account)o;
		return this.accNumber == c.accNumber;
	}
	
	// hashCode
	
}
