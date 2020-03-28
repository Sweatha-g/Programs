import java.util.Scanner;

public class Palnum {
        public boolean toPaln() {
            int sum = 0;
            int r = 0;
            int q;
            Scanner SC = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = SC.nextInt();
            int num1 = num;
            while(num1>0) {
                r = num1 % 10;
                q = num1 / 10;
                sum = (sum * 10) + r;
                num1 = q;
            }
                if(num==sum){
                    return true;
                }
                else{
                    return false;
                }


        }

    public static void main(String[] args) {
            Palnum mynum = new Palnum();
            System.out.println(mynum.toPaln());
}
}
