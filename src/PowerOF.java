public class PowerOF {
    public double Power(int n) {
        double result =Math.pow(n,n);
            System.out.println("The power of " +n+ " is : " +result);
        // return false;
        // System.out.println(pow(2, 2));
        return result;
    }


    public static void main(String[] args) {
        PowerOF num =new PowerOF();
        // num.Squaren(4);
        //System.out.println("Square is :"  +num.Squaren(4));
       System.out.println( num.Power(5));
    }
}

