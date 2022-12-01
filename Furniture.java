public class Furniture {
    int price;

    public Furniture()
    {
        System.out.println("Furniture Created!!!");
    }

    public void display()
    {
        System.out.println("Price is Rs. "+price);
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }
}
