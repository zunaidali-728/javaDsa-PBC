public class LengthOfLastWord {
    public static void main(String[] args) {

    }
    static int lengthLast(String s){
        int n = s.length();
        int l = 0;

        for(int i = n-1; i>=0; i--){
            while(i >=0 && s.charAt(i) != ' '){
                i--;l++;
            }
            if(l != 0) return l;
        }

        return l;
    }
}
