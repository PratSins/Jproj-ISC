import java.util.*;

public class CalendarDemo {

   public static void main(String[] args) {

   // create a calendar
   Locale locale1 = Locale.CANADA;
   TimeZone tz1 = TimeZone.getTimeZone("GMT");
   Calendar cal1 = Calendar.getInstance(tz1, locale1);

   // create a second calendar with different timezone and locale
   Locale locale2 = Locale.GERMANY;
   TimeZone tz2 = TimeZone.getTimeZone("EST");
   Calendar cal2 = Calendar.getInstance(tz2, locale2);

   // display time zone for both calendars
   String tzname1 = tz1.getDisplayName();
   String tzname2 = tz2.getDisplayName();
   String name1 = locale1.getDisplayName();
   String name2 = locale2.getDisplayName();
   System.out.println("GMT and Canada: " + tzname1 + " " + name1);
   System.out.println("EST and Germany: " + tzname2 + " " + name2);
   }
}