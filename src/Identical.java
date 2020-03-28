import java.util.Scanner;

public class Identical {
    public boolean identiticalStr(String ch) {

      /*  Scanner SC = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String ch = SC.next();*/
        int len = ch.length();
        int j;
        int i;
        int count = 0;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                if (ch.charAt(i) == ch.charAt(j)) { //comparing string character values
                    count++;
                }
            }
            }
            if (count > 0) {
                //System.out.println("The String contains identical character");
                return true;
            } else
                //System.out.println("The String does not contain identical character");
            return false;
        }

    public static void main( String[] args){
        Identical text = new Identical();
        System.out.println(text.identiticalStr("Medam"));
        //text.Comparestr();
    }
}
