import java.util.Arrays;

public class Inverse {
    public String inverseArray(int a[]){
        //int a[] = new int[]{2,3,4,5};
        int len =a.length;
        int inv[] =new int[len];
        int i;
        for(i=0;i<len;i++){
            inv[i] =-a[i];
        }
        //System.out.println(Arrays.toString(inv));
        return Arrays.toString(inv);

    }
    public  static void main(String[] args){
        Inverse ar = new Inverse();
      System.out.println(ar.inverseArray(new int[]{2,3,4,5}));
    }
}
