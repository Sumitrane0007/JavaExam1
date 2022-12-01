public class Adapter {
    public static void main(String args[])
    {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        //wrap a bird in a birdAdapterso that it
        //behaves like a toy duck

        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("\nSparrow...");
        sparrow.fly();
        sparrow.makesound();

        System.out.println("\nToyDuck...");
        toyDuck.squeak();

        //toyDuck behaving like a bird
        System.out.println("\nBirdAdapter...");
        birdAdapter.squeak();

        System.out.println("\n");
    }
}
