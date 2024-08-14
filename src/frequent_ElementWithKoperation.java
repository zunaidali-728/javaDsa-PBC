import java.util.Arrays;

public class frequent_ElementWithKoperation {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a");
        StringBuilder sb1 = new StringBuilder("a");

        System.out.println(sb.compareTo(sb1) == 0);
        String s = "afghan";
        System.out.println(s.charAt(1) - 'a');
        System.out.println(s.contentEquals(sb));


//        System.out.println(sb.isEmpty());



    }
    static int array(int[] a, int k){
        int current_sum = 0;
        int max_frequency = 0;
        int i = 0;
        int j = 0;

        while(j < a.length){
            current_sum += a[j];

            while(current_sum+k < a[j]*(j-i)+1){
                current_sum -= a[i];
                i++;
            }

            max_frequency = Math.max(max_frequency,(j-i)+1);
            j++;


        }

        return max_frequency;
    }
}
