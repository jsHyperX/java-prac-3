import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WeekyWeek {

    public String[] firstNdLastDay() {
        Calendar c = Calendar.getInstance();

        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        String str[]=new String[2];
        str[0]=df.format(c.getTime());

        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        str[1]=df.format(c.getTime());
        return  str;
    }
}
