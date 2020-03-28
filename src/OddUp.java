import java.util.Arrays;

public class OddUp {
    public String toOddEven(int a[]){
        int len = a.length;
        int j=0;
        int temp;
        int i;
        for(i=0;i<len;i++){
            if((a[i]%2)!=0){
              a[i]=a[i]+1;
            }
            else{
                a[i] =a[i]-1;
            }
        }
        //for (i = 0; i < len; i++) //for loop to print the array
           // System.out.println(Arrays.toString(a));//to return an array
        return Arrays.toString(a);

    }
    public static void main(String[] args){
        OddUp ar =new OddUp();
        System.out.println(ar.toOddEven(new int[]{1,2,3,5}));
    }

}
