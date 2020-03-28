import java.util.Scanner;


public class RemoveFL {
    public void removeFirstandLast(){
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter a String:");
        String text = SC.nextLine();
        int len =text.length();
        String new1 = text.substring(1,len-1);//begin index inclusive, endindex - exclusive
        System.out.println("The new String is :" +new1);

        }

    public String removeFirstAndLastChars(String str){
        String text = str;
        int len =text.length();
        String new1 = text.substring(1,len-1);//begin index inclusive, endindex - exclusive
        System.out.println("The new String is :" +new1);
        return new1;
    }

    public static void main(String[] args){
    RemoveFL sstring =new RemoveFL();
    sstring.removeFirstandLast();
}
}
