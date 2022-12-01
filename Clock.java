public class Clock {
    private int hours,minutes,seconds;

    public Clock(int h, int m, int s)
    {
        hours = h;
        minutes = m;
        seconds = s;
    }

    public Clock(int hours)
    {
        this.hours = hours;
        minutes = 0;
        seconds = 0;
    }

    public Clock()
    {
        this(12);
    }

    public void TimeDisplay()
    {
        System.out.println(hours+":"+minutes+":"+seconds+"\n");
    }

    public void secondsElapsed()
    {
        if (seconds > 59){
            seconds = seconds - 60;
            minutes++;
        }
        if (minutes > 59){
            minutes = minutes - 60;
            hours++;
        }
        if (hours > 11){
            hours = hours - 12;
        }
    }

    public static void main(String args[])
    {
        Clock c1 = new Clock();
        Clock c2 = new Clock(3);
        Clock c3 = new Clock(11,10,69);
        Clock c4 = new Clock(11,59,68);

        System.out.println("c1 - ");c1.TimeDisplay();
        System.out.println("c2 - ");c2.TimeDisplay();
        System.out.println("c3 - ");c3.TimeDisplay();
        System.out.println("c4 - ");c4.TimeDisplay();

        c3.secondsElapsed();
        System.out.println("Corrected c3 - ");c3.TimeDisplay();

        c4.secondsElapsed();
        System.out.println("Corrected c4 - ");c4.TimeDisplay();
    }
}
