import java.util.Scanner;

public class InheritanceTester {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("Do you want a dog or cat?");
        String answer = s.nextLine();

        if(answer.equalsIgnoreCase("Cat"))
        {
            System.out.println("Enter cat color: ");
            String cColor = s.nextLine();

            System.out.println("Enter cat breed: ");
            String cBreed = s.nextLine();

            c.setColor(cColor);
            c.setBreed(cBreed);
            c.display();

            c.Meow();
            c.Purr();
            c.eat();
            c.sleep();
        }

        else if(answer.equalsIgnoreCase("Dog"))
        {
            System.out.println("Enter dog color: ");
            String dColor = s.nextLine();

            System.out.println("Enter dog breed: ");
            String dBreed = s.nextLine();

            d.setColor(dColor);
            d.setBreed(dBreed);
            d.display();

            d.Bark();
            d.moveTail();
            d.eat();
            d.sleep();
        }

        s.close();
    }

}
