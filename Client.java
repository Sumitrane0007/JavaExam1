public class Client {
    public static void main(String args[])
    {
        HotelKeeper keeper = new HotelKeeper();

        System.out.println("\nVeg Menu : ");
        keeper.showVegMenu();

        System.out.println("----------------------\n");

        System.out.println("Non Veg Menu : ");
        keeper.showNonVegMenu();

        System.out.println("----------------------\n");

        System.out.println("Veg & Non Veg Menu : ");
        keeper.showVegNonVegMenu();

        System.out.println("----------------------");
    }
}
