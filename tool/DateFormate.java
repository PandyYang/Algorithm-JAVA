package tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Pandy
 * @version 1.0
 * @date 23:54
 */
public class DateFormate {

    public static void fun(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String newDate;
        try {
            newDate = sdf.format(new SimpleDateFormat("yyyMMdd").parse("20190830"));
            System.out.println("newDate = " + newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fun();
    }

}
