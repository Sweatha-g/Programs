public class Recursive {
    public static  int recSum(int sum, int n){
        if(n==0){
            return sum+0;
        }
        return recSum(sum+n,n-1);
    }
    public  static void main(String[] args){

        System.out.println(recSum(0,5));
    }
}
