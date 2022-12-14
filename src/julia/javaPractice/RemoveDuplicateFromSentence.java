package julia.javaPractice;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicateFromSentence {
    public static void main(String[] args) {
        String str = "I love java java love always";
        String [] arr = str.split(" ");
        Set<String> mySet = new LinkedHashSet<>();
        for (String each : arr){
            mySet.add(each);
        }
        Iterator itr = mySet.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
