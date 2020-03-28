import java.util.Arrays;

public class Min {
        public String minMax(int[] a){
            //int a[] = {7,6,11,9,20};
            int small=a[0];
            int n = a.length;
            int temp = 0;
            for(int i =0;i<n;i++){
                for(int j = i+1;j<n;j++){
                    if(a[i]>a[j]){
                        temp = a[i];
                        a[i]=a[j];
                        a[j] =temp;
                    }
                }
            }
            int min =a[0];
            int max =a[n-1];
            //System.out.println("Smallest number is " + a[0]);
            //System.out.println("largest number is " + a[n-1]);
            return Arrays.toString(new int[] {min,max});
        }
    public static  void main(String[] args) {
            Min num =new Min();
            System.out.println(num.minMax(new int[]{7,6,11,9,20}));

    }
}
