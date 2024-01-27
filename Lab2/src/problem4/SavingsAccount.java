package problem4;

public class SavingsAccount extends Account{
	int interestVariable;
	SavingsAccount(int accNumber){
		super(accNumber);
		this.interestVariable = 10;
	}
	public void deposit(double sum) {
		double newBalance = sum * interestVariable/100;
		sum=sum+newBalance;
		super.deposit(sum);
	}
}
