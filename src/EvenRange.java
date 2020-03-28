public class EvenRange {
    public int sumEven(int n,int k){
        int sum =0;
        for(int i=n+1;i<k;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
       //System.out.println("The Sum of all  even numbers between " +n+ " and " +k+ " is:"+sum);
        return sum;
    }
    public static void main(String[] args){
        EvenRange even =new EvenRange();
        System.out.println(even.sumEven(5,10));
    }
}
