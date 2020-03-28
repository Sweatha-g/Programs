public class IndexOf {
    public int toGetIndex(String a[],String txt){
        int len =a.length;
        int i;
        int count =0;
        for(i=0;i<len;i++) {
            if (a[i].equals(txt)) {
                count = i ;
                break;
            }
        }
        if(count > 0){
            //System.out.println("The index is : "+count);
            return count;
        }
        else
            System.out.println("The String not found");
        return -1;
    }
public static void main(String[] args){
        IndexOf str =new IndexOf();
        System.out.println(str.toGetIndex(new String[]{"Green","White","Blue","Red"},"red"));
}
}
