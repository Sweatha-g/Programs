import java.util.Scanner;

public class RevUpp {
    public String toReverse(String text){
       /* String text, rev = "";
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter string: ");
         text=sc.nextLine();*/
       String rev ="";
        int count =0;
        text = text.toUpperCase();
        int i = text.length();
        for (i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }
        //System.out.println("The Reverse String is "+rev);
        return rev;
    }


    public static void main(String[] args) {
        RevUpp myChar = new RevUpp();
        System.out.println(myChar.toReverse("november"));
    }
}
