public class MakeAoneStringTOAnotherSubStringMinimumTimes {
    public static void main(String[] args) {
        System.out.println(minWay("leo","oleole"));
    }
    static int minWay(String a, String b){
        int n = a.length(); int m = b.length();


        StringBuilder sb  = new StringBuilder(a);
        // make the a larger than the b, check it is contain the b or not if it not contain then add only 1 more time after then check again if it then return answer otherwise it is not the substring of a..
        while(sb.length() < b.length()){
            sb.append(a);
        }

        // if it not present add 1 more time
        if (!sb.toString().contains(b)) sb.append(a);

//        check it it substring or not
        if (sb.toString().contains(b)){ // final checkk fasle means it not the substring of a
            return sb.length()/n;
        }

        return -1;




    }
}
