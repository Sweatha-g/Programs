import java.util.*;
public class FindingNe {

    public int toFindNe(String ne) {
        //String ne = "I am finding Nemo";
        //char[] ch = new char[ne.length()];
        int position =0;
        String[] input = ne.split(" ");
        for(int i =0;i<input.length;i++){
            if(input[i].equals("Nemo")){
                position =i+1;
            }
        }
        if(position>0){
           // System.out.println("The String Nemo was found at Position: "+position);
            return position;
        }
        else
           // System.out.println("The String Nemo not found");
        return -1;

    }
    public static void main(String[] args){
        FindingNe nemo = new FindingNe();
        //nemo.toFindNe();
        System.out.println(nemo.toFindNe("I am finding Nemo"));

    }
}
