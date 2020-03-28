import java.util.Arrays;

public class ArrReplace {

    static StringBuilder replaceMethod(String str, String from, String to) {
        String[] arr = str.split(from);
        StringBuilder output = new StringBuilder();
        //System.out.println(Arrays.toString(arr)); //Array arr output after split
        int i;
        for ( i=0; i < arr.length-1; i++) {

            //System.out.println( output.append(arr[i]).append(to));
            output.append(arr[i]).append(to);
        }
       // System.out.println(output);
       // System.out.println(output.append(arr[arr.length-1]));
        output.append(arr[arr.length-1]);


    return output;

}

public static void main(String[] args){
    ArrReplace array =new ArrReplace();
   // System.out.println(array.replaceMethod("Do you ever feel like a plastic bag","i","wi" ));
   StringBuilder output2 = new StringBuilder(array.replaceMethod("Do you ever feel like a plastic bag","i","wi" ));
    //System.out.println(array.replaceMethod(,"e","we" ));
   /* System.out.println(output2);*/
    StringBuilder output3 =new StringBuilder(array.replaceMethod(output2.toString(),"e","we"));
   // System.out.println(output3);
    System.out.println(output3.toString().concat("owo"));
}
}