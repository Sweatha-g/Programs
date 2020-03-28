import java.util.Scanner;

public class Positive {
    public int positiveint(int number) {

        /*Scanner SC = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int number = SC.nextInt();*/
        if (number > 0) {
            //System.out.println("The number " + number+ " is greater than 0");
            return 1;
        } else if(number==0){
           // System.out.println("The number " + number+ " is equal to 0");
            return 0;
        }
        else {
           // System.out.println("The number " + number+ " is less than 0");
            return -1;
        }
    }
    public static void main(String[] args) {
        Positive num = new Positive();
        System.out.println(num.positiveint(5));

    }
}
