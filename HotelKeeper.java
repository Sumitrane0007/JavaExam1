public class HotelKeeper {
    private VegMenu vegMenu;
    private NonVegMenu nonVegMenu;

    public HotelKeeper()
    {
        this.vegMenu = new VegMenu();
        this.nonVegMenu = new NonVegMenu();
    }

    public void showVegMenu()
    {
        this.vegMenu.showMenu();
    }

    public void showNonVegMenu()
    {
        this.nonVegMenu.showMenu();
    }

    public void showVegNonVegMenu()
    {
        this.vegMenu.showMenu();
        this.nonVegMenu.showMenu();
    }
}
