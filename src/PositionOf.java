public class PositionOf {
    public int position(int a[], int n) {
        //int a[] ={1,2,3,4,9};
        int len = a.length;
        int i;
        int position = 0;
        for (i = 0; i < len; i++) {
            if (a[i] == n) {
                position = i+1;
                break;
                //return position;
                // System.out.println(+i);

            }
        }
            if (position > 0) {
                return position;
            }
            return -1;
            //System.out.println("-1");

        }
        // System.out.println("-1");



    public static void main(String[] args) {
        PositionOf num = new PositionOf();
       System.out.println( num.position(new int[]{3,4, 6, 5}, 5));
        //num.position(new int[]{3, 5, 6, 7}, 5);
    }
}



