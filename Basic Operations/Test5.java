package BasicOperations;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test5 {
    public static void main(String[] args){
        GregorianCalendar gc= new GregorianCalendar(2014,1,1);
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
    }
}
