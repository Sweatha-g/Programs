import java.util.Scanner;

public class Ascii {
    public int charToAscii(char ch) {

        // ch = 'g';
        int value = (int) ch;
        char rev = (char) value;
        System.out.println("The Ascii value of " + ch + "  is :" +value);
        System.out.println("The char value of " + value + "  is :" +rev);
        return value;
    }
    public int Reverse(String s) {
        // String  s = "1234";
         int n = Integer.parseInt("1234");
         int a =56;
         String rev = String.valueOf(a);
        System.out.println("The integer value of " + s + "  is :" +n);
        System.out.println("The String value of " + a + "  is :" +rev);
return n;
    }

    public void arNum(){

    }
    public static void main( String[] args){
        Ascii text = new Ascii();
        System.out.println(text.charToAscii('g'));
        System.out.println(text.Reverse("1234"));
    }

}
