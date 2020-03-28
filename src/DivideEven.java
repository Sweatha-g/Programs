public class DivideEven {
    public boolean toDivEven(int a,int b){
        if(a%b==0) {
            return true;
        }
            else
                return false;

        }
        public static void main(String[] args){
        DivideEven even =new DivideEven();
        System.out.println(even.toDivEven(45,5));
        }
    }

