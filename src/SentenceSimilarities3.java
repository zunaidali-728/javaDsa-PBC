import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SentenceSimilarities3 {
    public static void main(String[] args) {

    }
    static boolean checkSimilarity(String sentence1, String sentence2) {
        String[]  a = sentence1.split(" ");
        String[]  b = sentence2.split(" ");
        int i = 0; int j = 0;
        while(i < a.length && j  < b.length){
            if(!a[i].trim().equals(b[j].trim())) break;
            i++;j++;
        }
        if( i == a.length || j == b.length) return true;
        int x = a.length-1; int y  = b.length-1;

        while(x >= i && y >= j){
            if (!a[x].trim().equals(b[y].trim())) return false;
            x--;y--;
        }

        return x < i || y < i;

    }
}

