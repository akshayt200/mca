import java.util.*;

class InsufficientFundException extends Exception 
{
    	private double availableBalance;

    	public InsufficientFundException(double availableBalance) 
	{
        	this.availableBalance = availableBalance;
    	}

    	public double getAvailableBalance() 
	{
        	return availableBalance;
    	}
}

class BankAccount 
{
    	private double balance;

    	public BankAccount(double initialBalance) 
	{
        	balance = initialBalance;
    	}

    	public void withdraw(double amount) throws InsufficientFundException 
	{
        	if (amount > balance) 
		{
            		throw new InsufficientFundException(balance);
        	}
        	balance -= amount;
    	}

    	public double getBalance() 
	{
        	return balance;
    	}
}

public class Q17_Bank 
{
    	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter the initial balance: ");
        	double initialBalance = scanner.nextDouble();
        	scanner.nextLine();

        	BankAccount account = new BankAccount(initialBalance);

        	try 	
		{
            		System.out.print("Enter the amount to withdraw: ");
            		double withdrawalAmount = scanner.nextDouble();
            		scanner.nextLine();

            		account.withdraw(withdrawalAmount);
            		System.out.println("Withdrawal successful. Remaining balance: " + account.getBalance());
        	} 
		catch (InsufficientFundException e) 
		{
            		System.out.println("Insufficient funds. Available balance: " + e.getAvailableBalance());
        	} 
    	}
}