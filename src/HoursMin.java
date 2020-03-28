import java.util.Scanner;

public class HoursMin {
    public int hourssec(int hour) {

       /* Scanner SC = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hour = SC.nextInt();*/

        int sec;
        if (hour > 0) {
            sec = hour * 3600;
            return sec;
        } else {
            //System.out.println("Hours should be greater than 0");
            return 0;
        }
    }

    public int minssec(int min) {
        /*Scanner SJ = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int min = SJ.nextInt();*/
        int sec;
            sec = min * 60;
            return sec;

    }
        public static void main(String[] args) {
            HoursMin hours = new HoursMin();
            System.out.println(hours.hourssec(3));
            HoursMin min = new HoursMin();
            System.out.println(min.minssec(20));
            int total = hours.hourssec(4)+ min.minssec(20);
            System.out.println("The total seconds is  :"+total);


        }
    }



