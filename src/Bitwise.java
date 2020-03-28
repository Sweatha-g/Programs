public class Bitwise {
    public String bitWiseAnd(int a,int b){
        int c =(a&b);
        int d =(a|b);
        //System.out.println(+c);
       // System.out.println(Integer.toBinaryString(c<<0));
        //System.out.println(Integer.toBinaryString(d<<0));
        //System.out.println(String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0"));
        //System.out.println(String.format("%8s", Integer.toBinaryString(d)).replace(" ", "0"));
String e=String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
return e;
    }
    public static void main (String[] args){
        Bitwise num =new Bitwise();
        System.out.println(num.bitWiseAnd(6,23));
    }
}
