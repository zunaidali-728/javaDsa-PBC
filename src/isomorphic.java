public class isomorphic {
    public static void main(String[] args) {
        System.out.println(isoString("paper","title"));
    }
    static boolean isoString(String s, String t){
        String b = s;
        String d = t;


        for (int i = 0; i <s.length() ; i++) {
          s =  s.replace(b.charAt(i),d.charAt(i));
          t = t.replace(d.charAt(i),b.charAt(i));
        }

        return s.equals(d) || t.equals(b);
    }
}
