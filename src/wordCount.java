import java.util.Scanner;

    public class wordCount {

        public static void main(String[] args){

            int Count =0;

            Scanner SC=new Scanner(System.in);

            System.out.print("Enter string: ");
            String text=SC.nextLine();

            //word count
            for(int i=0; i<text.length(); i++)
            {
                if(text.charAt(i)==' ' )
                    Count=Count+1;
            }
            System.out.println("the number of Words are:"+(Count+1));
        }



    }





