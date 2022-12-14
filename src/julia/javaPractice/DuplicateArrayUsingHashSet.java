package julia.javaPractice;
import java.util.HashSet;
import java.util.Set;
public class DuplicateArrayUsingHashSet {
    public static void main(String[] args) {
        int[] arr = {2,5,3,2,6,7,6,7,9};
        Set<Integer> set = new HashSet<>();
        for (int each : arr){
            if (!set.add(each)){
                System.out.println("Duplicate: " + each);
            }
        }
    }
}
