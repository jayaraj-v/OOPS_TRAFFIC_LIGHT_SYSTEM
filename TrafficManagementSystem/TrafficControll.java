package TrafficLightSystem;

import TrafficLightSystem.Enums.Lights;

public class TrafficControll
{
    private static boolean isL1Active=true;
    protected static  void controlTraffif()
    {
        while(true)
        {
            if(isL1Active)
            {
                System.out.println("<-------------LANE_1------------->");
                runLights("l1");
                isL1Active=false;
            }
            else
            {
                System.out.println("<-------------LANe_2------------->");
                runLights("l2");
                isL1Active=true;
            }
        }
    }
    private static void runLights(String lane)
    {
        for(Lights l:Lights.values())
        {
            System.out.println(getAction(l));
            try
            {
                Thread.sleep(l.getDuration());
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
                return;
            }
        }
    }
    private static String getAction(Lights l)
    {
        return switch (l)
        {
            case RED -> "🟥 : STOP!";
            case YELLOW -> "🟨 : GET READY!";
            case GREEN -> "🟩 : GO!";
        };
    }
}
