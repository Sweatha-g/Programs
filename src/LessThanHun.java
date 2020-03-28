import java.util.Scanner;

public class LessThanHun {
    public int calculateNum(int num) {

       /* Scanner SC = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = SC.nextInt();*/

        if (num > 100) {
            //System.out.println(+num+ " is greater than 100");
            return 2;
        } else if (num == 100){
           // System.out.println(+num + " is equal to 100");
            return 0;
        }
        else {
            //System.out.println(+num + " is less than 100");
            return 1;
        }
    }

    public static void main( String[] args){
        LessThanHun num = new LessThanHun();
        System.out.println(num.calculateNum(45));
    }
}
