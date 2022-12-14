package julia.javaPractice;
import java.util.Arrays;
public class DuplicateArrayUsingSorting {
    public static void main(String[] args) {
        int[] arr = {2,5,3,6,4,2,5};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]){
                System.out.println("Duplicate: " + arr[i]);
            }
        }
    }
}
