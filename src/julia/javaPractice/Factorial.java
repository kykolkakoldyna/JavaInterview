package julia.javaPractice;
public class Factorial {
    public static void main(String[] args) {
        // 5! = 5*4*3*2*1 = 120
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " = " + factorial);
    }
}
