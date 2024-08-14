public class RomanTOInteger {
    public static void main(String[] args) {
        System.out.println(roman("MCMXCIV"));

    }
    static int roman(String s){
        int Roman = 0;
        int currentNum = 0;
        for (int i = 0; i <s.length() ; i++) {
            int n = RomanWord(s.charAt(i));
            if (currentNum < n){
                Roman += (n-currentNum) - currentNum;
            }
            else{
               Roman += n;
            }
            currentNum = n;
        }

        return Roman;

    }
    static int RomanWord(char c){
        if (c == 'I'){
            return 1;
        }
        else if (c == 'V'){
            return 5;
        }
        else if (c == 'X'){
            return 10;
        }
        else if(c == 'L'){
            return 50;
        }
        else if (c == 'C'){
            return 100;
        }
        else if(c == 'D'){
            return 500;
        }
        else{
            return 1000;
        }
    }
}
