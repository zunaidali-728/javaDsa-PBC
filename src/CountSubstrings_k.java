public class CountSubstrings_k {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(countSub(s,2));
    }
    static int countSub(String s,int k){
        int subStr = 0;
        int l = s.length();
        String str;

        for (int i = 0; i<l; i++){
            int cnt = 0;
            str = "";
            for (int j = i; j <l ; j++) {
                if (!str.contains(String.valueOf(s.charAt(j)))){
                  str += s.charAt(j);
                    cnt++;
                }
                if (cnt > k) break;
                if (cnt == k) subStr++;

            }
        }

        return subStr;
    }
}
