public class Max {

    public int maxtri(int a, int b, int c) {
        int max;
        if ((a < 0) || (b < 0) || (c < 0)) {
            //System.out.println("Enter a positive integer");
            return -1;
        } else if ((a > b) && (a > c))
            // System.out.println("a is the max");
            return a;
        else if ((b > a) && (b > c))
            //System.out.println("b is the max");
            return b;
        else if ((c > a) && (c > b)) {
            //System.out.println("c is the max");
            return c;
        }
        else return 0;
    }
    public int ThirdAngle(int a, int b) {
        int c;
        c =180 -(a+b);
        //System.out.println("The third angle is  "+c);
        return c;
    }

    public static void main(String[] args) {
        Max edge = new Max();
      System.out.println(edge.maxtri(60,60,60));
        System.out.println(edge.ThirdAngle(110,50));
    }
}

