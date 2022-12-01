import java.util.Scanner;

public class COR {
    public static void main(String args[])
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            do{
                System.out.println("Please enter amount to withdraw (multiple of 10, max 1000$, Press Ctlr + C to end) : ");
                int amount = scanner.nextInt();
                if(isValid(amount))
                {
                    ATMWithdrawal.withdraw(new PaperCurrency(amount));
                }
            }while(true);
        }
    }

    public static boolean isValid(int amount)
    {
        if(amount <= 0)
        {
            System.out.println("Invalid amount. Try Again!");
            return false;
        }
        else if(amount > 1000)
        {
            System.out.println("Daily withdrawal limit is 1000$. Try Again!");
            return false;
        }
        else if(amount % 10 != 0)
        {
            System.out.println("Amount must be multiple of 10s. try Again!");
            return false;
        }
        return true;
    }
}
