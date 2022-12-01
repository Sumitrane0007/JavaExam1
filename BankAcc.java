public class BankAcc {
    private double balance;
    
    public BankAcc()
    {
        balance = 0.0;
    }

    public void deposite(double amount)
    {
        balance = balance+amount; 
    }

    public void withdraw(double amount)
    {
        if(balance >= amount)
        {
            balance = balance-amount;
        }
        else
        {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public void transfer(double amount, BankAcc transferAccount)
    {
        if(balance >= amount)
        {
            withdraw(amount);
            transferAccount.deposite(amount);
        }
        else
        {
            System.out.println("Cannot transfer, not enough balance.");
        }
    }
}
