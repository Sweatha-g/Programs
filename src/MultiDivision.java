public class MultiDivision {
    public boolean toGetMulti(int a,int b,int c ){
        int sum =a*b;
        if(sum%c==0){
            return true;
        }else
            return false;
    }
    public static void main (String[] args){
        MultiDivision div =new MultiDivision();
        System.out.println(div.toGetMulti(5,2,1));
    }
}
