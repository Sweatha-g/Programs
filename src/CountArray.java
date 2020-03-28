import java.util.Arrays;

public class CountArray {
    public String toCountDown(int n){
        int i;
        int len =n+1;
        int a[] = new int[len];
       // a[0] =n+1;
for(i =0;i<len;i++) {
    a[i] = n;
   n--;

}
        //System.out.println(Arrays.toString(a));
return  Arrays.toString(a);
    }
    public static void main(String[] args){
        CountArray arr =new CountArray();
        System.out.println(arr.toCountDown(5));
    }
}
