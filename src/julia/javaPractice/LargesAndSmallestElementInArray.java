package julia.javaPractice;
public class LargesAndSmallestElementInArray {
    public static void main(String[] args) {
        int[]arr = {2,7,33,78,4,35};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>largest){
                largest = arr[i];
            } else if (arr[i]<smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
