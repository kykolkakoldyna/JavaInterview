package julia.javaPractice;
import java.util.Arrays;
public class StringToByte {
    public static void main(String[] args) {
        String str = "Hello";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
}
