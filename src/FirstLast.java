import java.util.Arrays;

public class FirstLast {
        public String  firstLast(int a[]) {
            //int a[] ={1,2,3,4,9};
            int count =0;
            int len =a.length;
            int[] b=new int[]{a[0],a[len-1]};
           // System.out.println(+a[len-1]);
            //System.out.println(+a[len-len]);
            return Arrays.toString(b);

        }
        public static void main(String[] args){
            FirstLast ar = new FirstLast();
           System.out.println(ar.firstLast(new int[]{1,2,3,4,9}));

        }
    }


