package julia.javaPractice;
import java.util.Arrays;
public class Anagram {
    // same characters and same length
    public static void main(String[] args) {
        String str1 = "stop";
        String str2 = "post";
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}
