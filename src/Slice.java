import java.util.Scanner;

public class Slice {
    public int Check(int slice,int people) {

       /* Scanner SC = new Scanner(System.in);
        System.out.print("Enter the number of Slices:");
        int slice = SC.nextInt();
        Scanner ST = new Scanner(System.in);
        System.out.print("Enter the number of People:");
        int people = ST.nextInt();*/
        if(slice % people ==0){
           // System.out.println( "The Pie slices are evenly distributed");
            return 0;
        }
        else{
            //System.out.println( "The Pie slices are  not evenly distributed");
            return -1;
        }

    }
    public static void main( String[] args){
        Slice num = new Slice();
        System.out.println(num.Check(30,6));
    }
}

