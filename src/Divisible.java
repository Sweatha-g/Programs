import java.util.Scanner;

public class Divisible {
    public boolean DivOf(int num) {

       /* Scanner SC = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = SC.nextInt();*/
        if(num % 5 ==0){
           // System.out.println(+num+ "  is Divisible by 5");
            return true;
        }
        else{
            //System.out.println(+num+ "  is not divisible by 5");
            return false;
        }

    }
    public static void main( String[] args){
       Divisible num = new Divisible();
        System.out.println(num.DivOf(45));
    }
}

