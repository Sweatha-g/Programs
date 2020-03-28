public class Jackpot {
    public boolean toHitJackpot(String a[]){
        int len =a.length;
        int count =0;
        for(int i =0;i<len-1;i++){
            if(a[i].equals(a[i+1])){ //compare the next array of string values
                count++;
            }
        }
        if(count==len-1){
            return true;
        }
            else{
                return false;

            }
    }
    public static void main(String[] args){
        Jackpot jack = new Jackpot();
        System.out.println(jack.toHitJackpot(new String[]{"abc","abc","abc","abc"}));

    }
}
