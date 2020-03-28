import java.util.Arrays;

public class DivideArry {
    public String toDivideArray(int[] a, int n){
        int len = a.length;
        //int output[] = new int[len];
        //int j ;
        for(int i =0;i<len;i++){
            a[i]=a[i]%n;
        }
        //System.out.println(Arrays.toString(a));
        return Arrays.toString(a);
    }
    public static void main(String[] args){
        DivideArry input =new DivideArry();
        System.out.println(input.toDivideArray(new int[]{5,7,8,2,1},2));
    }

}
