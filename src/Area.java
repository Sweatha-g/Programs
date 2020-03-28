import java.util.Scanner;

public class Area {
    public  int getCalculate(int b, int h) {
int area=0;
        if ((b > 0) && (h >0)) {
             area = (b * h) /2 ;
            //System.out.println("The area of triangle is  " + area );
        }
        else {
            System.out.println("Enter a positive value for b and h");
        }
        return area;
    }
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println(area.getCalculate(10, 40));

    }
}
