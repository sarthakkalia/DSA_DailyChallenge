public class ValidPaliindrome {
    static boolean isPallindrome(String str){
        int l=0;
        int r=str.length()-1;
        if (str.isEmpty()) {
        	return true;
        }
        while (l<r) {
            char currFirst = str.charAt(l);
        	char currLast = str.charAt(r);
            if (!Character.isLetterOrDigit(currFirst )) {
        		l++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		r--;
            }
            else{
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		l++;
        		r--;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        System.out.println(isPallindrome(str));
    }
}
