import javax.swing.*;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.*;
public class DateFunc {
    public static void dateConv(String date1) {
Date date ;
        String Out_DATE_FORMAT ="";
        SimpleDateFormat sdf = new SimpleDateFormat(Out_DATE_FORMAT);
// August 12, 2010
       // String date1 = "10/03/2020";
        try {
             date = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
            Out_DATE_FORMAT = "yyyyMMdd";
            // Create object of SimpleDateFormat and pass the desired date format.
            //SimpleDateFormat sdf = new SimpleDateFormat(Out_DATE_FORMAT);
            /* Use format method of SimpleDateFormat class to format the date.
             */
            System.out.println("Today is " + sdf.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        //return sdf.format(date);

    }


    public static void main(String[] args){
        DateFunc dt =new DateFunc();
        dt.dateConv("10/03/2020");
    }
}
