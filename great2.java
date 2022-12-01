import java.util.Scanner;


public class great2 {
    public static void main(String args[])
    {
        System.out.println("Enter first number:");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();

        System.out.println("Enter second number:");
        int b = s1.nextInt();

        int greatest = Math.max(a, b);
        System.out.println("Greatest number is: "+greatest);

        s1.close();
    }
}
