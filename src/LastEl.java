import java.util.Arrays;

public class LastEl {
    public int Last(int[] a) {
        //int a[] ={1,2,3,4,9};
        int count =0;
        int len =a.length;
           //System.out.println(+a[len-1]);
           return a[len-1];

    }
    public static void main( String[] args){
        LastEl ar = new LastEl();
        System.out.println(ar.Last(new int[]{1,2,3,4,9}));
    }
}
