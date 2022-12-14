package julia.javaPractice;

public class FactorialUsingRecursion {
    // 5! = 5*4*3*2*1 = 120 (recursion is a function calling itself)
    public static int findFactorial(int n){
        if (n<=1){
            return 1;
        }else {
            return n * findFactorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " = " + findFactorial(n));
    }
}
