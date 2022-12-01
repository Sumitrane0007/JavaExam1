import java.util.Scanner;

public class ComputerTester {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Laptop l = new Laptop();
        Netbook n = new Netbook();

        System.out.println("Laptop or Netbook?");
        String answer = s.nextLine();

        if(answer.equalsIgnoreCase("Laptop"))
        {
            System.out.println("Enter CPU name : ");
            String lcpuName = s.nextLine();

            System.out.println("Enter CPU speed : ");
            Double lcpuSpeed = s.nextDouble();

            l.setCpuName(lcpuName);
            l.setCpuSpeed(lcpuSpeed);
            l.display();
            l.switchOn();
        }
        else
        {
            System.out.println("Enter CPU name : ");
            String ncpuName = s.nextLine();

            System.out.println("Enter CPU speed : ");
            Double ncpuSpeed = s.nextDouble();

            n.setCpuName(ncpuName);
            n.setCpuSpeed(ncpuSpeed);
            n.display();
            n.switchOn();
        }

        s.close();
    }
}
