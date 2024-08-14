public class maxReapeatingSubstring {
    public static void main(String[] args) {
        System.out.println(maxRepeat("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba"));
        StringBuilder sb = new StringBuilder();
        sb.insert(0,'a');
        System.out.println(sb);
    }
    static int maxRepeat(String sequence, String word){
        int c = 0;
        int n = sequence.length();
        StringBuilder sb = new StringBuilder(word);
//        String temp = word;
        while(sb.length() <= n){
            if(sequence.contains(sb)) c++;
            sb.append(word);
        }


        return c;

    }
}
