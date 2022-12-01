public class CricketData {
    int runs, wickets;
    float overs;

    CurrentSCoreDisplay currentSCoreDisplay;
    AverageScoreDisplay averageScoreDisplay;

    public CricketData(CurrentSCoreDisplay currentSCoreDisplay, AverageScoreDisplay averageScoreDisplay)
    {
        this.currentSCoreDisplay = currentSCoreDisplay;
        this.averageScoreDisplay = averageScoreDisplay;
    }

    //Get latest runs from stadium
    private int getLatestRuns()
    {
        //return 90 for simplicity
        return 90;
    }

    //get latest wickets from stadium
    private int getLatestWickets()
    {
        //return 2 for simplicity
        return 2;
    }

    //get latest overs from stadium
    private float getLatestOvers()
    {
        //return 10.2 for simplicity
        return (float)10.2;
    }

    //This method is used to update display when data chnages
    public void dataChange()
    {
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        currentSCoreDisplay.update(runs, wickets, overs);
        averageScoreDisplay.update(runs, wickets, overs);
    }
}
