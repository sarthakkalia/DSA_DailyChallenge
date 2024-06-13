public class RemoveConsecutiveChar {
    public static String removeConsecutiveCharacter(String str){
        String ans="";
        ans= ans+ str.charAt(0);
        for(int i=1; i< str.length();i++){
            if(str.charAt(i)!= str.charAt(i-1)){
                ans+=str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aabb";
        String ans= removeConsecutiveCharacter(str);
        System.out.println(ans);
    }
}
