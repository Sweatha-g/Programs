import static java.lang.Math.*;
public class Square {
    public int Squaren(int n) {
        int square = 0;
        if (n > 0) {
            square = n * n;
        }
        return square;
    }

    public boolean Power(int k, int n) {
double result =Math.pow(n,n);
        if(result==k){
            System.out.println(Math.pow(5, 5));
           return true;
            //System.out.println("true");
        }
        else
            //System.out.println("false");

        return false;

    }


    public static void main(String[] args) {
        Square num =new Square();
       // num.Squaren(4);
        System.out.println("Square is :"  +num.Squaren(4));
        System.out.println(num.Power(27,3));
    }
}
