public class NextInt {
    public int getNextInt(int n) {
       // int n = 50;
        int next=0;
        if(n>=0){
           next = n+1;
           // System.out.println("Next  integer is :" +next);

        }
        return next;
    }
    public static void main(String[] args) {
        NextInt n =new NextInt();
        System.out.println(n.getNextInt(50));

    }
}
