package julia.javaPractice;
public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {2,5,3,6,4,2,5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate: " + arr[i]);
                }
            }
        }
    }
}
