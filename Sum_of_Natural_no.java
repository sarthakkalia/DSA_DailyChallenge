public class Sum_of_Natural_no {
    public static void sum(int i,int n){
        int sum=0;
        for(i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static int sum_using_formula(int N){
        int sum = N * (N + 1) / 2;
        return sum;
    }

    public static void sum_using_recursion(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum_using_recursion(i-1, sum+i);
    }
    public static int func(int N){
        if (N==0){
            return 0;
        }
        return N+func(N-1);
    }

    public static void main(String[] args) {
        sum(0, 4);
        System.out.println(sum_using_formula(4));
        sum_using_recursion(4, 0);
        System.out.println(func(4));
    }
}
