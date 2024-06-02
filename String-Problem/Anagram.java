import java.util.Arrays;

public class Anagram {
    public static String sorting(String str){
        char c[]=str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static boolean anagram(String str1, String str2){
        if (str1.length() != str2.length())
            return false;
        str1=sorting(str1);
        str2=sorting(str2);
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)) return false;
        }
        return true;
    }
    public static boolean checkAnagram(String str1,String str2){
        if (str1.length() != str2.length())
            return false;
        int[] freq=new int[26];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)- 'A']++;
        }
        for(int i=0;i<str1.length();i++){
            freq[str2.charAt(i)- 'A']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
              return false;
          }
        return true;
    }




    public static void main(String[] args) {
        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";
        System.out.println(checkAnagram(Str1, Str2));
    }
}
