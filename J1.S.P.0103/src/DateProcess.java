
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProcess {

    public int compareDate(Date firstDate, Date secondDate) {
       if(firstDate.equals(secondDate)){
           return 0;
       }
       else if(firstDate.after(secondDate)){
           return 1;
       }else{
           return -1;
       }
    }
}
