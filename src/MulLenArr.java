import java.util.Arrays;
import java.util.Scanner;

public class MulLenArr {
    public  String multiply(int[] a) {

       // int a[] = {2, 3, 4, 5};
        int len = a.length;
        int sum[] = new int[len];
        int i = 0;
        for (i = 0; i < len; i++) {
            sum[i] = a[i] * len;

            //System.out.println(+sum[i]);
        }
        //System.out.println(Arrays.toString(sum));
        return Arrays.toString(sum);//return an array string value
    }

    public static void main( String[] args){
        MulLenArr result = new MulLenArr();
        //result.multiply(new int[] {2,3,4,6});
        System.out.println(result.multiply(new int[] {2,3,4,6}));
    }
}
