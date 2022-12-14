package julia.javaPractice;
import java.util.LinkedHashMap;
import java.util.Map;
public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "sthjuyuktyrgrgggrfdsfuoysrthysthsthdkgltusrtjuhj74795789l]]][[]";
        Map<Character, Integer> map = new LinkedHashMap<>();
        char strArr[] = str.toCharArray();
        for (char each : strArr){
            if (map.containsKey(each)){
                map.put(each, map.get(each) + 1);
            }else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }
}