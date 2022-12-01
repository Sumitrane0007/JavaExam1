public class Intfchild extends Parent1 implements Intfparent1,Intfparent2{
    public void show()
    {
        super.show();
        Intfparent2.super.show();
        System.out.println("Default PI 1");
    }   

    public static void main(String args[])
    {
        Intfchild c = new Intfchild();
        c.show();
    }
}
