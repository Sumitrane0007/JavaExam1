public class CurrentSCoreDisplay {
    private int runs,wickets;
    private float overs;

    public void update(int runs, int wickets, float overs)
    {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
    }

    public void display()
    {
        System.out.println("\nCurrent Score Display :" + "\nRuns : "+runs+ "\nWickets : "+wickets+ "\nOvers : "+overs);
    }
}
