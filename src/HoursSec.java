import java.util.Scanner;

public class HoursSec {

    public int hourssec(int hour) {

       /* Scanner SC = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hour = SC.nextInt();*/

        int sec;
        if (hour > 0) {
            sec = hour * 3600;
           // System.out.println("The seconds for the given hour " + hour + "is:" + sec);
            return sec;
        } else {
            //System.out.println("Hours should be greater than 0");
            return 0;
        }
    }
    public static void main( String[] args){
        HoursMin hours = new HoursMin();
        System.out.println(hours.hourssec(3));
    }
}
