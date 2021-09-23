/**
This is the Date class.
This class gets the local date (pulled from the package java.time API),
and converts it to a string value. If you do not convert this to a 
string, then the object in the main class will be printed with @ and random numbers,
which I assume relates to the memory location.
 */

import java.time.LocalDate;

public class Date{

    public String Date(){
        LocalDate d = LocalDate.now();
        String date = String.valueOf(d);
        return date;
    }
}