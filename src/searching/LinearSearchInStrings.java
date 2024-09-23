package searching;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        String name="Krishna";
        char target='a';
        System.out.println(search(name,target));
    }

    static boolean search(String str,char target){
        //Since str of string class length has braces.
        if(str.length()==0)
            return false;
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i))
                return true;
        }
        return false;
    }
}
