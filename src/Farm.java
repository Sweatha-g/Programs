public class Farm {
        public int calculateC(int c) {
int count =0;
            for(int i =1;i<=c;i++){
               count = count+2;
            }
            return count;
        }
    public int calculateCO(int co) {
        int count =0;
        for(int i =1;i<=co;i++){
            count = count+ 4;
        }
        return count;
    }
    public int calculatePI(int pi) {
        int count =0;
        for(int i =1;i<=pi;i++){
            count = count+ 4;
        }
        return count;
    }
        public static void main(String[] args) {
            Farm count = new Farm();
            int total  =count.calculateC(6)+count.calculateCO(10)+count.calculatePI(5);
            System.out.println("the total no of legs are  : " +total);
    }
}

