public class validParentheses {
    public static boolean isvalidParentheses(String s){
        while (true) {
            if(s.contains("{}")){
                s=s.replace("{}", "");
            }else if(s.contains("()")){
                s=s.replace("()", "");
            }else if(s.contains("[]")){
                s=s.replace("[]", "");
            }else{
                return s.isEmpty();
            }
        }
    }
    public static void main(String[] args) {
        String str="()";
        System.out.println(isvalidParentheses(str));
    }
}
