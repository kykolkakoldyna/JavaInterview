package julia.javaPractice;
import java.util.HashMap;
import java.util.Map;
public class DuplicateArrayUsingHashMap {
    public static void main(String[] args) {
        int[] arr = {2,5,3,2,6,7,6,7,9};
        Map<Integer,Integer> map = new HashMap<>();
        for (int each : arr){
            if (!map.containsKey(each)){
                map.put(each, 1);
            }else {
                map.put(each, map.get(each)+1);
            }
        }
        for (Integer each : map.keySet()){
            if (map.get(each) > 1){
                System.out.println("Duplicate: " + each);
            }
        }
    }
}
