public class ArrayNum {
    public boolean toCheckNum(char a[]){
        int len =a.length;
        int count =0;
        boolean b;

        for(int i =0;i<len;i++) {
          b = Character.isDigit(a[i]);
          if(b)
              count++;
        }

       /* for(int i =0;i<len;i++){
            if((a[i]=='0')||(a[i]=='1')||(a[i]=='2')||(a[i]=='3')||(a[i]=='4')||(a[i]=='5')||(a[i]=='6')||
                    (a[i]=='7')||(a[i]=='8')||(a[i]=='9')){
                count++;
            }
        } */
       if(count>0) {
            return true;
        }
    else
        return false;
}
public static void main(String[] args){
        ArrayNum num =new ArrayNum();
        System.out.println(num.toCheckNum(new char[]{'1','c','b','c'}));
    }
}
