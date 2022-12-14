package julia.javaPractice;
public class CountChars {
    public static void main(String[] args) {
        String str = "rgr46DF.!***";
        int upper = 0, lower = 0, number = 0, other = 0;
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (Character.isUpperCase(letter)){
                upper++;
            } else if (Character.isLowerCase(letter)) {
                lower++;
            } else if (Character.isDigit(letter)) {
                number++;
            } else {
                other++;
            }
        }
        System.out.println("Upper: " + upper + "\nLower: " + lower + "\nNumbers: " + number + "\nOther: " + other);
    }
}
