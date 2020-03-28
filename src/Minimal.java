public class Minimal {
    public int toMinimal(int a[]) {
        int len = a.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] % 2 == 1) {
                count++;
            }
        }
            if (count % 2 == 0) {
                return 0;
            } else
                return 1;
        }


    public static void main(String[] args){
            Minimal num=new Minimal();
            System.out.println(num.toMinimal(new int[]{5,2,3,6}));
        }

        }



