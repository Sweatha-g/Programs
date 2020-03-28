public class Determinant {
    public int detOfMatrix(int[][] mat ){
        /*int[][] mat =new int[][]{
                {4,5},
                {3,9}
        };*/
        int d =mat[0][0]*mat[1][1] -mat[0][1]*mat[1][0];
 //System.out.println("The determinant of matrix is "  +d);
        return d;
    }

public  static void main(String[] args){
        Determinant matrix = new Determinant();
        System.out.println(matrix.detOfMatrix(new int[][]{{4,5},{3,9}}));
}
}
