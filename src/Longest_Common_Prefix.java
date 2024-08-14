public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] s = {"flower", "flow", "flight"};
        System.out.println(prefix(s));
        System.out.println(prefixs(s));
    }
    static String prefix(String[] strs){

        int minLength = Integer.MAX_VALUE;
        for (String s : strs){
            minLength = Integer.min(s.length(),minLength);
        }
        int l = strs.length;
        int c;
        int i = 0;
        StringBuilder sb = new StringBuilder("");
       char ch = '!';

        while(i<minLength){
            ch = strs[0].charAt(i);
            c = 1;
            for (int k = 1; k<l ; k++) {
                if (strs[k].charAt(i) == ch){
                    c++;
                }
            }
            if (c != l) break;
            i++;
        }

        return String.valueOf(sb.append(strs[0],0,i));
    }
    static String prefixs(String[] s){
        String pre = s[0];

        for (String str : s) {
            while (str.indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
        }

        return pre;
    }

}
