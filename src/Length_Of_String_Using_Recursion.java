public class Length_Of_String_Using_Recursion {
    public static void main(String[] args) {
        System.out.println(length(""));
    }
    static int length(String str){
        return size(0,str.length());
    }
    static int size(int length, int p){
        if (p == 0){
            return length;
        }
       return size(++length,--p);
    }
}
