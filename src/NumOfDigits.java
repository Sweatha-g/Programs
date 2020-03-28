public class NumOfDigits {
    public int toGetNumDigits(int a) {
        int count = 0;
        int r;
        while (a > 0) {
            r = a % 10;
            count = count + 1;
            a = a / 10;
        }
        return count;

    }

    public static void main(String[] args) {
        NumOfDigits num = new NumOfDigits();
        System.out.println(num.toGetNumDigits(342));
    }
}
