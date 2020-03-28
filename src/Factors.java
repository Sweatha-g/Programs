public class Factors {
    public boolean checkFactor(int a[],int num){
        int i;
        int len =a.length;
        for(i=0;i<len;i++){
            if(num%a[i]!=0){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Factors tst = new Factors();
        System.out.println(tst.checkFactor(new int[]{5,3,4},12));
    }
}
