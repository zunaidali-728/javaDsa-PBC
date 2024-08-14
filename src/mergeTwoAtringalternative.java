public class mergeTwoAtringalternative {
    public static void main(String[] args) {

    }
    static String merge(String a, String b){
        int i = 0; int j = 0;
        int n = a.length(), m = b.length();
        // instead of this we can use the String Builder also.
        char[] merge = new char[m+n]; int k = 0;

        while(i < n && j < m){
            merge[k++] = a.charAt(i++);
            merge[k++] = b.charAt(j++);
        }

        while(i < n){
            merge[k++] = a.charAt(i++);
        }
        while(j < m){
            merge[k++] = b.charAt(j++);
        }


        return new String(merge);


    }
}
