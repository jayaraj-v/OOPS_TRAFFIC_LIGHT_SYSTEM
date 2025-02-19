package TrafficLightSystem.Enums;

public enum Lights
{
   YELLOW(2000),GREEN(3000) ,RED(0);
    private final int duration;
    Lights(int duration)
    {
        this.duration=duration;
    }
    public int getDuration()
    {
        return duration;
    }
}
