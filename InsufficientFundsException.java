package BankApplication;

public class InsufficientFundsException  extends Exception{
	public InsufficientFundsException (String s1) {
		super(s1);
}
}
class  InvalidAmountException  extends Exception{
	public InvalidAmountException (String s2) {
		super(s2);
		}
	
}
class AccountNotFoundException  extends Exception{
	public AccountNotFoundException(String s3) {
		super(s3);
	}
}
class LoanNotAllowedException extends Exception{
	public LoanNotAllowedException  (String s4) {
		super(s4);
	}
}
interface Bank
{
	public void deposit(double amount)throws InsufficientFundsException, InvalidAmountException;
	double getBalance();
	public void transfer1(BankAccount toAccount, double amount)throws InsufficientFundsException,AccountNotFoundException, InvalidAmountException;
public void appliedFroloan(double amount) throws LoanNotAllowedException, InvalidAmountException;
public double getBalance1();
}
class BankAccount implements Bank
{
	private long accountNumber;
	private double balance;
	public long getAccountNumber() {
		return accountNumber;
	}
public void setAccountNumber(long accountNumber) {
	this.accountNumber= accountNumber;
	}
public double getBalance1() {
	return balance;
}
public void setBalance(double balance) {
	this.balance= balance;
}

	@Override
	public void deposit(double amount) throws InsufficientFundsException, InvalidAmountException {
		if(amount<=0){
			{
				throw new InvalidAmountException("Invalid amount");
			}
		}
			else {
				balance= balance+amount;
				System.out.println("Deposited successfully.");
				
			}
		}
	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException
	{
		if(amount<=0)
		{
			throw new  InvalidAmountException("Invalid amount");
		}
		if (balance<=0)
		{
			throw new InsufficientFundsException("Insufficient balence");
		}
		balance = balance-amount;
	}
	
	
	@Override
	public void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException 
	{
		
		if(balance<amount)
		{
			throw new  InsufficientFundsException("  ");
		}
		if(toAccount.equals(null))
		{
			throw new AccountNotFoundException("Account not found");
		}
		if(amount<=0)
		{
			throw new InvalidAmountException("you dont hava money");
		}
		
		
	}
	
	
	@Override
	public void appliedFroLoan(double amount) throws LoanNotAllowedException, InvalidAmountException
	{
		if(amount==0)
		{
			throw new InvalidAmountException("Your amunt is not enough");
		}
		int limit =50000;
		
		  if(limit<amount)
		  {
			  throw new LoanNotAllowedException("you are not eligible for loan");
		  }
		
	}
	
	
	@Override
	public double getBalance() {
		
		return balance;
	}  
	
	public BankAccount(long accountNumber, double balance )
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public void transfer(double amt) {
		// TODO Auto-generated method stub
		
	}
}
class Customer
{
	private String name;
	private BankAccount account;
	public Customer(String name, BankAccount account) {
		this.name= name;
		this.account= account;
	}
	public BankAccount getAccount() {
		return account;
	
	}
}

	


		
	
	