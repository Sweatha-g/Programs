import java.util.Scanner;

public class Concatenate {
        public String toConcat(String fn,String ln) {

            /*Scanner SC = new Scanner(System.in);
            System.out.print("Enter the First Name : ");
            String fn = SC.nextLine();
            Scanner ST = new Scanner(System.in);
            System.out.print("Enter the Last Name : ");
            String ln = ST.nextLine();*/
            String con = fn.concat(" "+ln);
           // System.out.println("The Full name is : " + con);
            return con;
        }
        public static void main( String[] args){
            Concatenate text = new Concatenate();
            System.out.println(text.toConcat("Sweatha","G"));
        }
}
