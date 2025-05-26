package BankApplication;
import java.util.Scanner;
public class ATM {
	public static void main(String [] args)  throws InvalidAmountException, InsufficientFundsException , AccountNotFoundException, LoanNotAllowedException{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter you bank account number:");
		long accoNo= sc.nextLong();
		System.out.println("Enter your balance:");
		double bal=sc.nextDouble();
		
		BankAccount ba= new BankAccount(accNo, bal);
		System.out.println("Select an option:\n1. Deposit\n2.Withdraw\3.Transfer\n4. Loan Application\n5. Check Balance\n6. Exit");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter the depoist amount.")	;
			double amt= sc.nextDouble();
			ba.withdraw(amt);
		}
		break;
			
	case 2:
	{
		System.out.println("Enter the withdrawing amount: ");
		double amt= sc.nextDouble();
		ba.withdraw(amt);
		}break;
		
		case 3:
		{
			System.out.println("Enter the transferring account no:");
			long acNO1= sc.nextLong();
			ba.setAccountNumber(accNo1);
			System.out.println("Enter the transferring amount:");
			ba.trasfer(ba, amt);
		}
		break;
		case 4:
		{
			System.out.println("Enter the loan amout:");
			double amt= sc.nextDouble();
			ba.appliedFroLoan(amt);
		}break;
		
		case 5:{
			System.out.println("You balance amout is:");
			ba.getBalance();
		}
		break;
		default:
			System.out.println("Invalid choice entered !!");
			
		}
	}
		}
		
	


