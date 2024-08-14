import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
       String a = "zunaid ali is a good boy";

        System.out.println(a.strip());
        System.out.println(Arrays.toString(a.splitWithDelimiters(" ",2)));
        System.out.println(a.indexOf("dead"));
        StringBuilder sb = new StringBuilder("zunaid");
        sb.replace(0,2,"ali");
        System.out.println(sb);
        sb.delete(0,5);
        System.out.println(sb);
        sb.insert(0,'A');
        System.out.println(sb);
    }
    static String restore(String s, int[] indices){
        char[] c = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
           c[indices[i]] = s.charAt(i);
        }

        return new String(c);  // direct return the array in the String object it will giv ethe string


//        StringBuilder sb = new StringBuilder();
//
//
//        for(char a : c){
//            sb.append(a);
//        }
//
//
//        return sb.toString();
    }
}
