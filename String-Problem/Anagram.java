// Check if two Strings are anagrams of each other

import java.util.Arrays;

public class Anagram {
    static String sorting(String str){
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    
    static boolean anagram(String str1, String str2){
        str1=sorting(str1);
        str2=sorting(str2);
        for (int i = 0; i < str1.length(); i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String Str1 = "air";
    String Str2 = "rai";
    System.out.println(anagram(Str1, Str2));
    }
}
