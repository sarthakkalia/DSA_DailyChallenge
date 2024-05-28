// Factorial of a Number : Iterative and Recursive

public class Factorial_of_number {
    public static void main(String[] args) {
        System.out.println(fact_iterative(5));
        System.out.println(fact_recursive(5));
    }

    static int fact_iterative(int N){
        int sum=1;
        for (int i=1;i<=N;i++){
            sum*=i;
        }
        return sum;
    }
    static int fact_recursive(int N){
        if (N==0){
            return 1;
        }
        return N*fact_iterative(N-1);
    }
}
