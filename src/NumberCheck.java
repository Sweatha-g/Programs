public class NumberCheck {
    public boolean check(int a, int b) {

        if (a==b) {
            //System.out.println("The numbers are equal" );
            return  true;
        }
        else {
            //System.out.println("The numbers are not equal");
            return false;
        }
    }
    public static void main(String[] args) {
        NumberCheck num = new NumberCheck();
        System.out.println(num.check(10, 10));

    }
}
