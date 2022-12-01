public class Animal {
    String color, breed;

    public void eat()
    {
        System.out.println("*Eating Noise*");
    }

    public void sleep()
    {
        System.out.println("*Sleeping Noise*");
    }

    public void display()
    {
        System.out.println("Color is "+color);
        System.out.println("Breed is "+breed);
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public String getBreed()
    {
        return breed;
    }
}
