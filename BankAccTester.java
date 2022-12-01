public class BankAccTester {
    public static void main(String args[])
    {
        BankAcc a = new BankAcc();
        System.out.println("A balance: "+a.getBalance());

        System.out.println("Deposite 1000");
        a.deposite(1000);
        System.out.println("A balance: "+a.getBalance());

        System.out.println("Withdraw 100");
        a.withdraw(100);
        System.out.println("A balance: "+a.getBalance());

        BankAcc b = new BankAcc();
        System.out.println("B balance: "+b.getBalance());
        
        System.out.println("Transferring 500 from A to B");
        a.transfer(500, b);
        System.out.println("A balance: "+a.getBalance());
        System.out.println("B balance: "+b.getBalance());
    }
}
