import java.util.Scanner;

public class Multiple {
    public boolean multipleOf(int num) {

       /* Scanner SC = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = SC.nextInt();*/
        if(num % 100 ==0){
           // System.out.println(+num+ "Number is a multiple of 100");
            return true;
        }
        else{
           // System.out.println(+num+ "Number is not a multiple of 100");
            return false;
        }

    }
    public static void main( String[] args){
        LessThanHun num = new LessThanHun();
        System.out.println(num.calculateNum(200));
    }
}

