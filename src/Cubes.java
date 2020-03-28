public class Cubes {

    public int sumOfCubes(int a[]) {
        int len = a.length;
        int sum = 0;
        int cube;
        for (int i = 0; i < len; i++) {
            cube = a[i] * a[i] * a[i];
            sum =sum+cube;

        }
        return sum;
    }
    public static void main (String[] args){
        Cubes num =new Cubes();
        System.out.println(num.sumOfCubes(new int[]{4,5,2}));
    }
}


