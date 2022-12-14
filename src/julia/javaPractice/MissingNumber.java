package julia.javaPractice;
public class MissingNumber {
    public static void main(String[] args) {
        int[] numArr = {1,2,3,4,5,6,8,9};
        int sum = 0;
        int expectedSum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        for (int i = 1; i <= 9; i++) {
            expectedSum += i;
        }
        System.out.println(expectedSum-sum);
    }
}
