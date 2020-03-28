public class Remainder {

        public int remain(int a, int b) {
            int rem;
            if(a>b) {
                rem = a % b;
                //System.out.println("Remainder of a and b is:" + rem);
                return rem;
            }
            else {
                rem = b % a;
               // System.out.println("Remainder of b and a is:" + rem);
                return rem;
            }
        }

        public static void main(String[] args) {
            Remainder remain = new Remainder();
            System.out.println(remain.remain(4,30));
        }
    }

