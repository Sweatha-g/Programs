import java.util.Scanner;

import java.util.Scanner;

public class Palendrome {

    public void toTest() {
        String str, rev = "";
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter string: ");
        str = SC.nextLine();

        str = str.toLowerCase();
        int i = str.length();
        for (i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("It is Palendrome");
        } else {
            System.out.println("It is not Palendrome");
        }
    }


    public static void main(String[] args) {
        Palendrome myChar = new Palendrome();
        myChar.toTest();
    }
}