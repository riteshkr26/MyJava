import java.time.*;

import java.util.*;

public class Datedemo  {
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception{
        
        Date d= new Date("07/16/2024");
        /*Date d1= new Date();
        d1.setHours(22);
        System.out.println(d1);*/
        LocalTime t=LocalTime.now();
        System.out.println(t);
       // t.minusHours(3);
       LocalTime t1=t.minusHours(3);
        System.out.println(t1);
        LocalDate d2=LocalDate.now(ZoneId.of("Europe/Paris"));
        LocalDate d3=LocalDate.of(2020, Month.MARCH, 10);
        LocalDate d4=LocalDate.parse("2020-03-10");
        LocalDate d5=d4.plusMonths(6);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d2);
        System.out.println(d3);
        GregorianCalendar  gc = new GregorianCalendar();
        gc.setTimeZone(TimeZone.getTimeZone("America/NewYork"));
        TimeZone tz= gc.getTimeZone();
        System.out.println(tz.getID());
        System.out.println(gc.getTimeInMillis());
        System.out.println(d.getYear()+1900);
        System.out.println(d.getDate());

        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);
    }
}
