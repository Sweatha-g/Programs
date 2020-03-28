import java.util.Scanner;

public class EmptyStr {
    public boolean Stringc(String text) {

        /*Scanner SC = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = SC.nextLine();*/
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count = count + 1;
            }
        }
        if(count == text.length()){
            //System.out.println(" It is  a Empty String");
            return true;
        }
        else
            //System.out.println(" It is not   a Empty String");
        return false;
        }
    public boolean Plural(String text) {

        /* SC = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = SC.nextLine();*/
        int len = text.length();
            if (text.charAt(len-1) == 's') {
                //System.out.println(" It is  Plural");
                return true;
            }
        else{
            //System.out.println(" It is Singular");
                return false;
        }

    }
    public String addEnding(String text) {

        /*Scanner SC = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = SC.nextLine();*/
        int len = text.length();
        String word= text.concat("ly");
        //System.out.println("The word is "+word);
        return word;

    }


    public static void main( String[] args){
        EmptyStr str = new EmptyStr();
       System.out.println(str.Stringc("madam"));
        System.out.println(str.Plural("pencils"));
        System.out.println(str.addEnding("love"));
    }
}

