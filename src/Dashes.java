import java.lang.String;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Dashes {
    public String stringOfDashes(int n){
        //int n=3;
        //String ch = null;
        char dsh[] = new char[n];
        Arrays.fill(dsh,'-');//method to fill the string
        String res = new String(dsh);
        //System.out.println(res);
return res;
        }

    public static void main( String[] args){
        Dashes num = new Dashes();
        System.out.println(num.stringOfDashes(3));
    }
}

