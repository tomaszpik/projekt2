import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class lab32 {
    public static void main(String[] args) throws ParseException {


        //Date today = new Date();
       // System.out.println("Today is : " + today);



        /*int d = 18;
        int m = 8;
        int r = 2018;

        System.out.println("Data: " + d +"." + m +"."+ r);
        */

        Calendar calendar = new GregorianCalendar(2018, 3, 21 );
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Data: " + dateFormat.format(calendar.getTime()));






    }
}
