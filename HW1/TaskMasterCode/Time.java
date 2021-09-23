/**
This also uses the java.time pakcage, and works in a similar way to the Date class.
See the Date class for more details.
 */


import java.time.LocalTime;

public class Time{

    public String Time(){
        LocalTime t = LocalTime.now();
        String time = String.valueOf(t);
        return time;
    }
}