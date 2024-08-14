public class CharacterReplacement {
    public static void main(String[] args) {
/*        Problem Statement:
        You are given a function,
        void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

        The function accepts a string ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its argument.
                Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in the original string are replaced by ‘ch2’ and all occurrences of ‘ch2’ in the original string are replaced by ‘ch1’.

        Assumption: String Contains only lower-case alphabetical letters.

        Note:
        Return null if the string is null.
                If both characters are not present in the string or both of them are the same , then return the string unchanged.

        Example:
        Input:
        Str: apples
        ch1:a
        ch2:p

        Output:
        paales     */
        String str = "apple";
        System.out.println(ReplaceCharacter(str,str.length(),'a','p'));

    }
    static String ReplaceCharacter(String str, int n, char ch1, char ch2){
        if(str == null || n == 0){
            return null;
        }
        if(ch1 == ch2) return str;

        char[] a = str.toCharArray();

        for(int  i = 0; i<n; i++){
            if(a[i]  == ch1){
                a[i] = ch2;
            }
            else if(a[i] == ch2){
                a[i] = ch1;
            }
        }

        return new String(a);

    }

}
