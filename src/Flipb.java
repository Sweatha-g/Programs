import java.util.Scanner;

public class Flipb {
    public boolean value(boolean sc) {
        //boolean sc =false;
        if(sc){
           // System.out.println("false");
            return false;
        }
        else
return true;
          // System.out.println("true");
    }
    public static void main(String[] args) {
        Flipb bool = new Flipb();
       System.out.println(bool.value(true)) ;

    }
}

