package julia.javaPractice;
public class Palindrome {
    public static void main(String[] args) {
        String str = "nitin";
        int j = str.length()-1;
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(j-i)){
                System.out.println("Is not palindrome");
            }
        }
        System.out.println("Palindrome");
    }
}
