import java.util.Scanner;

public class SpaceC {
    public int SpaceCont(String text) {

       /* Scanner SC = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = SC.nextLine();*/
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count = count + 1;
            }
        }
        if(count == 0){
           // System.out.println("There are no spaces");
            return 0;
        }
        else
           // System.out.println("The number of spaces in the string are : "+count);
        return count;

    }
    public static void main(String[] args) {
        SpaceC word = new SpaceC();
        System.out.println(word.SpaceCont("Hi How are you"));

    }
}

