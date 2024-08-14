import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Reverse_StringWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverse(s));

    }
    static String reverse(String str){
        int l = str.length();
        StringBuilder s  = new StringBuilder();
        int ind;
        for (int i = l-1; i>=0; i--){
            if(str.charAt(i) == ' '){
                if ((i+1)!=l) s.append(str, i+1, l).append(" ");
               l = i;
            }
        }
        if (str.charAt(0) != ' ') s.append(str,0,l);

       return String.valueOf(s).trim();

    }
}
