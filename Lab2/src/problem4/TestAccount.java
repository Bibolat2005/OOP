package problem4;
public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account(1);
        account.deposit(100);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(80);
        System.out.println("Balance after withdrawal: " + account.getBalance());
		
        
        
        CheckingAccount checkingAccount = new CheckingAccount(2);
        checkingAccount.deposit(100);
        checkingAccount.deductFee();
        System.out.println("Checking account balance: " + checkingAccount.getBalance());
        checkingAccount.deposit(100);
        checkingAccount.deductFee();
        System.out.println("Checking account balance: " + checkingAccount.getBalance());
        checkingAccount.deposit(100);
        checkingAccount.deductFee();
        System.out.println("Checking account balance: " + checkingAccount.getBalance());
        checkingAccount.deposit(100);
        checkingAccount.deductFee();
        System.out.println("Checking account balance: " + checkingAccount.getBalance());
        
        
        

        
        
        SavingsAccount savingsAccount = new SavingsAccount(3);
        savingsAccount.deposit(120);
        System.out.println("Savings account balance: " + savingsAccount.getBalance());
        
        
		Bank bank = new Bank();
        Account account10 = new Account(10);
        Account account11 = new CheckingAccount(11);
        Account account12 = new SavingsAccount(12);
        account10.deposit(100);
        account11.deposit(100);
        account12.deposit(150);
        bank.add(account10);
        bank.add(account11);
        bank.add(account12);

        //bank.update();
        bank.printAllAcc();
		
	}

}
