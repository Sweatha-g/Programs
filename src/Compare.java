import java.util.Scanner;

public class Compare {
    public boolean  Comparelen(String fn, String ln) {

        /*Scanner SC = new Scanner(System.in);
        System.out.print("Enter the First String: ");
        String fn = SC.nextLine();
        Scanner ST = new Scanner(System.in);
        System.out.print("Enter the Second String: ");
        String ln = ST.nextLine();*/
        int count =0;
        int count1 =0;
        for(int i =0;i<fn.length();i++){
            count = count +1;
        }
        for(int i =0;i<ln.length();i++){
            count1 = count1 +1;
        }
        if(count == count1){
           // System.out.println("Both the string lengths are equal");
            return true;
        }
        else{
            return false;
        }
    }
    public boolean Comparestr(String fn, String ln) {

       /* Scanner SC = new Scanner(System.in);
        System.out.print("Enter the First String: ");
        String fn = SC.nextLine();
        Scanner ST = new Scanner(System.in);
        System.out.print("Enter the Second String: ");
        String ln = ST.nextLine();*/
        if(fn.equalsIgnoreCase(ln)){
           // System.out.println("Both the string Match");
            return true;
        }
        else{
            //System.out.println("Both the string do not Match");
            return false;
        }
    }
    public static void main( String[] args){
        Compare text = new Compare();
        System.out.println(text.Comparelen("abc","abcd"));
        System.out.println(text.Comparestr("madamm","Madam"));
    }
}


