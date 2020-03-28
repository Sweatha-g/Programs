public class Perimeter {
    public int getPerim(int l,int w){

            //int l = 20;
            //int w = 40;
            int per = 2 * (l + w);
           // System.out.println("Perimeter is :" + per);
            return per;
        }

    public static void main(String[] args){
        Perimeter p =new Perimeter();
        System.out.println(p.getPerim(20,40));
}
}
