import java.util.Scanner;
public class NumToMon {
    public String monthCheck(int num) {
        /*Scanner numb = new Scanner(System.in);
        System.out.println("Enter the number of the month:");
        int num = numb.nextInt();*/
        String Month = " ";
        switch (num) {
            case 1:
                //System.out.println("It is January");
                return "January";
            case 2:
                //System.out.println("It is February");
                return "February";

            case 3:
                //System.out.println("It is  March");
                return "March";

            case 4:
                //System.out.println("It is  April");
                return  "April";

            case 5:
               // System.out.println("It is  May");
                return "May";

            case 6:
                //System.out.println("It is June");
                return "June";

            case 7:
               // System.out.println("It is a July");
                return "July";

            case 8:
               // System.out.println("It is August");
                return "August";

            case 9:
                //System.out.println("It is September");
                return "September";

            case 10:
                //System.out.println("It is October");
                return "October";

            case 11:
               // System.out.println("It is November");
                return "November";

            case 12:
                //System.out.println("It is December");
                return "December";

            default:
                //System.out.println("Enter a a valid Choice");
                return "Enter a  Valid Choice";

        }
    }
        public static void main(String[] args) {
            NumToMon myNum = new NumToMon();
            System.out.println(myNum.monthCheck(13));
        }

    }

