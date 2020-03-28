public class Fact {
    public int factNum(int n){
        int fact =1;
        for(int i =1;i<=n;i++){
            fact = fact*i;

        }
        return fact;

    }
    public  static void main(String[] args){
        Fact num=new Fact();
        System.out.println(num.factNum(4));
    }
}
