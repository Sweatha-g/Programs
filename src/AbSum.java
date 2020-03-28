import java.math.*;
public class AbSum {
    public int getAbSum(int a[]){
        int len =a.length;
        int sum=0;
        for(int i=0;i<len;i++){
            int j=Math.abs(a[i]);//method to return the absolute value
            sum=sum+j;
        }
        return sum;
    }
    public static void main(String[] args){
        AbSum num=new AbSum();
        System.out.println(num.getAbSum(new int[]{2,3,-1,5}));
    }
}
