import java.util.Scanner;

public class Even {
    public void Check() {

        Scanner SC = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = SC.nextInt();
        if(num % 2 ==0){
            System.out.println(+num+ "  is Even");
        }
        else{
            System.out.println(+num+ "  is Odd");
        }

    }
    public boolean Year(int year) {

        /*Scanner SC = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = SC.nextInt();*/
        if(year % 4 ==0){
           // System.out.println(+year+ "  The year is a leap year");
            return true;
        }
        else{
            //System.out.println(+year+ "  The year is not a leap year");
            return false;
        }

    }
    public static void main( String[] args){
       Even num = new Even();
        //num.Check();
        System.out.println(num.Year(2020));
    }
}

