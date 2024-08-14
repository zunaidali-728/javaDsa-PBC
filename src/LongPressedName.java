public class LongPressedName {
    public static void main(String[] args) {


    }
    static boolean longPressName(String name, String typed){
        int n = name.length(), m = typed.length();
        if (n > m || name.charAt(n-1) != typed.charAt(m-1)) return false;
        int i = 0, j = 0;

        while(i < n && j < m){

            if (name.charAt(i) == typed.charAt(j)) {
                i++;j++;
            }
            else if(i > 0 && name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else return false;
        }

        if (i < n) return false;

        while(j < m){
            if (name.charAt(i-1) != typed.charAt(j++)) return false;
        }

        return true;
    }
}
