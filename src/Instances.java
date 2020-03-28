import java.util.Scanner;

public class Instances {
    public int instanceStr(String sc,char ch) {

        //Scanner SC = new Scanner(System.in);
        //System.out.print("Enter the String: ");
        //String ch = SC.next();
        //char tst[] = sc.toCharArray();
        int len = sc.length();
        int i;
        int count = 0;
       int j=0;
        for (i = 0; i < len; i++) {
                if(sc.charAt(i)==ch){
                    count++;
                }
            }
            //System.out.println(+(count));
        return count;


        }


    public static void main(String[] args) {
        Instances text = new Instances();
        System.out.println(text.instanceStr("madam", 'm'));
        //text.Comparestr();
    }
}

