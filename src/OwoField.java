import java.util.Arrays;

public class OwoField {
    public void toAddOwo(String str) {

        String replace1 = str.replace("i", "wi");
        String replace2 = replace1.replace("e", "we");
        String last = replace2.concat("owo");
        System.out.println(last);

    }

    public static void main(String[] args) {
        OwoField owo = new OwoField();
        owo.toAddOwo("Do you ever feel like a plastic bag");
    }
}


