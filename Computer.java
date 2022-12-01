public class Computer{
    String cpuName;
    Double cpuSpeed;

    public void switchOn()
    {
        System.out.println("Computer switched ON");
    }

    public String getCpuName()
    {
        return cpuName;
    }

    public void setCpuName(String name)
    {
        cpuName = name;
    }

    public Double getCpuSpeed()
    {
        return cpuSpeed;
    }

    public void setCpuSpeed(Double speed)
    {
        cpuSpeed = speed;
    }

    public void display() 
    {
        System.out.println("CPU is " +cpuName+ ", speed is " +cpuSpeed+ " GHz");
    }
}